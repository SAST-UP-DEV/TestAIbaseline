import {renderCreativeIntoFriendlyFrame} from '../friendly-frame-util';

const realWinConfig = {
  amp: {},
  ampAdCss: true,
  allowExternalResources: true,
};

describes.realWin('FriendlyFrameUtil', realWinConfig, (env) => {
  const minifiedCreative = '<p>Hello, World!</p>';

  let window, document;
  let containerElement;
  let renderPromise;

  beforeEach(() => {
    window = env.win;
    document = window.document;

    containerElement = document.createElement('div');
    containerElement.signals = () => ({
      signal: () => {},
      reset: () => {},
      whenSignal: () => Promise.resolve(),
    });
    containerElement.renderStarted = () => {};
    containerElement.getLayoutBox = () => ({
      left: 0,
      top: 0,
      width: 0,
      height: 0,
    });
    containerElement.isInViewport = () => true;
    containerElement.getAmpDoc = () => env.ampdoc;
    document.body.appendChild(containerElement);

    const adUrl = 'http://www.google.com';
    const size = {width: '320', height: '50'};
    const creativeMetadata = {
      minifiedCreative,
      customElementExtensions: [],
      extensions: [],
    };

    renderPromise = renderCreativeIntoFriendlyFrame(
      adUrl,
      size,
      containerElement,
      creativeMetadata
    );
  });

  afterEach(() => {
    document.body.removeChild(containerElement);
  });

  it('should append iframe child', () => {
    return renderPromise.then((iframe) => {
      expect(iframe).to.be.ok;
      expect(iframe.contentWindow.document.body.innerHTML).to.equal(
        minifiedCreative
      );
    });
  });

  it('should set the correct srcdoc on the iframe', () => {
    return renderPromise.then((iframe) => {
      expect(iframe).to.be.ok;
      const srcdoc = iframe.getAttribute('srcdoc');
      expect(srcdoc).to.contain('<base href="http://www.google.com">');
      expect(srcdoc).to.contain(
        '<meta http-equiv=Content-Security-Policy content="script-src '
      );
      expect(srcdoc).to.contain(
        ";object-src 'none';child-src 'none'\"><p>Hello, World!</p>"
      );
    });
  });

  it('should set correct attributes on the iframe', () => {
    return renderPromise.then((iframe) => {
      expect(iframe).to.be.ok;
      expect(iframe.getAttribute('width')).to.equal('320');
      expect(iframe.getAttribute('height')).to.equal('50');
      expect(iframe.getAttribute('frameborder')).to.equal('0');
      expect(iframe.getAttribute('allowfullscreen')).to.equal('');
      expect(iframe.getAttribute('allowtransparency')).to.equal('');
      expect(iframe.getAttribute('scrolling')).to.equal('no');
    });
  });

  it('should style body of iframe document to be visible', () => {
    return renderPromise.then((iframe) => {
      expect(iframe).to.be.ok;
      expect(iframe.contentWindow.document.body.style.visibility).to.equal(
        'visible'
      );
    });
  });
});
