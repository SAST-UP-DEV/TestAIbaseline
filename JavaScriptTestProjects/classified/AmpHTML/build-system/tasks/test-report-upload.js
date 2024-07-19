/**
 * @fileoverview This file implements the `amp test-report-upload` task, which POSTs test result reports
 * to an API endpoint that stores them in the database.
 */

'use strict';

const fetch = require('node-fetch');
const fs = require('fs').promises;
const path = require('path');
const {
  ciBuildId,
  ciBuildUrl,
  ciCommitSha,
  ciJobId,
  ciJobUrl,
  ciRepoSlug,
} = require('../common/ci');
const {log} = require('../common/logging');

const {cyan, green, red, yellow} = require('../common/colors');

const REPORTING_API_URL = 'https://amp-test-cases.appspot.com/report';

/**
 * Parses a test report file and adds build & job info to it.
 * @param {('unit' | 'integration' | 'e2e')} testType The type of the tests whose result we want to report.
 * @return {Promise<Object.<string,Object>|null>} Object containing the build, job, and test results.
 */
async function getReport(testType) {
  try {
    const report = JSON.parse(
      await fs.readFile(`result-reports/${testType}.json`, 'utf-8')
    );

    return addJobAndBuildInfo(testType, report);
  } catch (e) {
    log(red('ERROR:'), 'Error getting test result report.\n', e.toString());

    return null;
  }
}

/**
 * Adds job and build info to a report.
 * @param {('unit' | 'integration' | 'e2e')} testType The type of the tests whose result we want to report.
 * @param {Object} reportJson The Json report generated by Karma.
 * @return {Object.<string,Object>} Object containing the build, job, and test results.
 */
function addJobAndBuildInfo(testType, reportJson) {
  const buildId = ciBuildId();
  const commitSha = ciCommitSha();
  const jobId = ciJobId();

  if (!buildId || !commitSha || !jobId) {
    throw new ReferenceError('CI fields are not defined.');
  }

  // (TODO ampproject/amp-github-apps/pull:1194) Update field names in database.
  return {
    repository: ciRepoSlug(),
    results: reportJson,
    build: {
      buildId,
      commitSha,
      url: ciBuildUrl(),
    },
    job: {
      jobId,
      testSuiteType: testType,
      url: ciJobUrl(),
    },
  };
}

/**
 * Sends a single report to the API endpoint for storage.
 * @param {('unit' | 'integration' | 'e2e')} testType The type of the tests whose result we want to report.
 * @return {Promise<void>}
 */
async function sendCiKarmaReport(testType) {
  const body = await getReport(testType);

  if (!body) {
    return;
  }

  const response = await fetch(REPORTING_API_URL, {
    method: 'post',
    body: JSON.stringify(body),
    headers: {'Content-Type': 'application/json'},
  });

  if (response.ok) {
    log(
      green('INFO:'),
      `Test results of type`,
      cyan(testType),
      'reported to',
      cyan(REPORTING_API_URL)
    );
  } else {
    log(
      yellow('WARNING:'),
      'failed to report results of type',
      cyan(testType),
      ': \n',
      yellow(/** @type {string} */ (await response.text()))
    );
  }
}

/**
 * Uploads every report to the API endpoint for storage.
 * @return {Promise<void>}
 */
async function testReportUpload() {
  const filenames = await fs.readdir('result-reports/');
  const testTypes = filenames.map((filename) => path.parse(filename).name);

  await Promise.all(testTypes.map(sendCiKarmaReport));
}

module.exports = {
  testReportUpload,
};

testReportUpload.description =
  'Send results from a test run to the AMP test result database';