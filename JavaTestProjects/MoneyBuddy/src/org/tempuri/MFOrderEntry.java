
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MFOrderEntry", targetNamespace = "http://bsestarmf.in/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactoryMFOrder.class,
    in.bsestarmf.ObjectFactory.class
})
public interface MFOrderEntry {


    /**
     * 
     * @param passKey
     * @param userId
     * @param password
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://bsestarmf.in/MFOrderEntry/getPassword")
    @WebResult(name = "getPasswordResult", targetNamespace = "http://bsestarmf.in/")
    @RequestWrapper(localName = "getPassword", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.GetPassword")
    @ResponseWrapper(localName = "getPasswordResponse", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.GetPasswordResponse")
    public String getPassword(
        @WebParam(name = "UserId", targetNamespace = "http://bsestarmf.in/")
        String userId,
        @WebParam(name = "Password", targetNamespace = "http://bsestarmf.in/")
        String password,
        @WebParam(name = "PassKey", targetNamespace = "http://bsestarmf.in/")
        String passKey);

    /**
     * 
     * @param euin
     * @param parma1
     * @param euinVal
     * @param buySell
     * @param clientCode
     * @param remarks
     * @param password
     * @param kycStatus
     * @param dpc
     * @param dpTxn
     * @param schemeCd
     * @param ipAdd
     * @param orderId
     * @param allRedeem
     * @param orderVal
     * @param folioNo
     * @param param2
     * @param param3
     * @param qty
     * @param transNo
     * @param buySellType
     * @param userID
     * @param passKey
     * @param refNo
     * @param memberId
     * @param subBrCode
     * @param minRedeem
     * @param transCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://bsestarmf.in/MFOrderEntry/orderEntryParam")
    @WebResult(name = "orderEntryParamResult", targetNamespace = "http://bsestarmf.in/")
    @RequestWrapper(localName = "orderEntryParam", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.OrderEntryParam")
    @ResponseWrapper(localName = "orderEntryParamResponse", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.OrderEntryParamResponse")
    public String orderEntryParam(
        @WebParam(name = "TransCode", targetNamespace = "http://bsestarmf.in/")
        String transCode,
        @WebParam(name = "TransNo", targetNamespace = "http://bsestarmf.in/")
        String transNo,
        @WebParam(name = "OrderId", targetNamespace = "http://bsestarmf.in/")
        String orderId,
        @WebParam(name = "UserID", targetNamespace = "http://bsestarmf.in/")
        String userID,
        @WebParam(name = "MemberId", targetNamespace = "http://bsestarmf.in/")
        String memberId,
        @WebParam(name = "ClientCode", targetNamespace = "http://bsestarmf.in/")
        String clientCode,
        @WebParam(name = "SchemeCd", targetNamespace = "http://bsestarmf.in/")
        String schemeCd,
        @WebParam(name = "BuySell", targetNamespace = "http://bsestarmf.in/")
        String buySell,
        @WebParam(name = "BuySellType", targetNamespace = "http://bsestarmf.in/")
        String buySellType,
        @WebParam(name = "DPTxn", targetNamespace = "http://bsestarmf.in/")
        String dpTxn,
        @WebParam(name = "OrderVal", targetNamespace = "http://bsestarmf.in/")
        String orderVal,
        @WebParam(name = "Qty", targetNamespace = "http://bsestarmf.in/")
        String qty,
        @WebParam(name = "AllRedeem", targetNamespace = "http://bsestarmf.in/")
        String allRedeem,
        @WebParam(name = "FolioNo", targetNamespace = "http://bsestarmf.in/")
        String folioNo,
        @WebParam(name = "Remarks", targetNamespace = "http://bsestarmf.in/")
        String remarks,
        @WebParam(name = "KYCStatus", targetNamespace = "http://bsestarmf.in/")
        String kycStatus,
        @WebParam(name = "RefNo", targetNamespace = "http://bsestarmf.in/")
        String refNo,
        @WebParam(name = "SubBrCode", targetNamespace = "http://bsestarmf.in/")
        String subBrCode,
        @WebParam(name = "EUIN", targetNamespace = "http://bsestarmf.in/")
        String euin,
        @WebParam(name = "EUINVal", targetNamespace = "http://bsestarmf.in/")
        String euinVal,
        @WebParam(name = "MinRedeem", targetNamespace = "http://bsestarmf.in/")
        String minRedeem,
        @WebParam(name = "DPC", targetNamespace = "http://bsestarmf.in/")
        String dpc,
        @WebParam(name = "IPAdd", targetNamespace = "http://bsestarmf.in/")
        String ipAdd,
        @WebParam(name = "Password", targetNamespace = "http://bsestarmf.in/")
        String password,
        @WebParam(name = "PassKey", targetNamespace = "http://bsestarmf.in/")
        String passKey,
        @WebParam(name = "Parma1", targetNamespace = "http://bsestarmf.in/")
        String parma1,
        @WebParam(name = "Param2", targetNamespace = "http://bsestarmf.in/")
        String param2,
        @WebParam(name = "Param3", targetNamespace = "http://bsestarmf.in/")
        String param3);

    /**
     * 
     * @param euin
     * @param orderValue
     * @param euinVal
     * @param buySell
     * @param transactionCode
     * @param redeemDate
     * @param clientCode
     * @param redemptionAmt
     * @param remarks
     * @param password
     * @param kycStatus
     * @param dpc
     * @param dpTxn
     * @param schemeCode
     * @param allUnitFlag
     * @param ipAddress
     * @param folioNo
     * @param orderID
     * @param param1
     * @param param2
     * @param param3
     * @param subBroCode
     * @param uniqueRefNo
     * @param buySellType
     * @param userID
     * @param passKey
     * @param refNo
     * @param memberId
     * @param minRedeem
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://bsestarmf.in/MFOrderEntry/spreadOrderEntryParam")
    @WebResult(name = "spreadOrderEntryParamResult", targetNamespace = "http://bsestarmf.in/")
    @RequestWrapper(localName = "spreadOrderEntryParam", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.SpreadOrderEntryParam")
    @ResponseWrapper(localName = "spreadOrderEntryParamResponse", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.SpreadOrderEntryParamResponse")
    public String spreadOrderEntryParam(
        @WebParam(name = "TransactionCode", targetNamespace = "http://bsestarmf.in/")
        String transactionCode,
        @WebParam(name = "UniqueRefNo", targetNamespace = "http://bsestarmf.in/")
        String uniqueRefNo,
        @WebParam(name = "OrderID", targetNamespace = "http://bsestarmf.in/")
        String orderID,
        @WebParam(name = "UserID", targetNamespace = "http://bsestarmf.in/")
        String userID,
        @WebParam(name = "MemberId", targetNamespace = "http://bsestarmf.in/")
        String memberId,
        @WebParam(name = "ClientCode", targetNamespace = "http://bsestarmf.in/")
        String clientCode,
        @WebParam(name = "SchemeCode", targetNamespace = "http://bsestarmf.in/")
        String schemeCode,
        @WebParam(name = "BuySell", targetNamespace = "http://bsestarmf.in/")
        String buySell,
        @WebParam(name = "BuySellType", targetNamespace = "http://bsestarmf.in/")
        String buySellType,
        @WebParam(name = "DPTxn", targetNamespace = "http://bsestarmf.in/")
        String dpTxn,
        @WebParam(name = "OrderValue", targetNamespace = "http://bsestarmf.in/")
        String orderValue,
        @WebParam(name = "RedemptionAmt", targetNamespace = "http://bsestarmf.in/")
        String redemptionAmt,
        @WebParam(name = "AllUnitFlag", targetNamespace = "http://bsestarmf.in/")
        String allUnitFlag,
        @WebParam(name = "RedeemDate", targetNamespace = "http://bsestarmf.in/")
        String redeemDate,
        @WebParam(name = "FolioNo", targetNamespace = "http://bsestarmf.in/")
        String folioNo,
        @WebParam(name = "Remarks", targetNamespace = "http://bsestarmf.in/")
        String remarks,
        @WebParam(name = "KYCStatus", targetNamespace = "http://bsestarmf.in/")
        String kycStatus,
        @WebParam(name = "RefNo", targetNamespace = "http://bsestarmf.in/")
        String refNo,
        @WebParam(name = "SubBroCode", targetNamespace = "http://bsestarmf.in/")
        String subBroCode,
        @WebParam(name = "EUIN", targetNamespace = "http://bsestarmf.in/")
        String euin,
        @WebParam(name = "EUINVal", targetNamespace = "http://bsestarmf.in/")
        String euinVal,
        @WebParam(name = "MinRedeem", targetNamespace = "http://bsestarmf.in/")
        String minRedeem,
        @WebParam(name = "DPC", targetNamespace = "http://bsestarmf.in/")
        String dpc,
        @WebParam(name = "IPAddress", targetNamespace = "http://bsestarmf.in/")
        String ipAddress,
        @WebParam(name = "Password", targetNamespace = "http://bsestarmf.in/")
        String password,
        @WebParam(name = "PassKey", targetNamespace = "http://bsestarmf.in/")
        String passKey,
        @WebParam(name = "Param1", targetNamespace = "http://bsestarmf.in/")
        String param1,
        @WebParam(name = "Param2", targetNamespace = "http://bsestarmf.in/")
        String param2,
        @WebParam(name = "Param3", targetNamespace = "http://bsestarmf.in/")
        String param3);

    /**
     * 
     * @param euin
     * @param parma1
     * @param euinVal
     * @param buySell
     * @param clientCode
     * @param remarks
     * @param password
     * @param kycStatus
     * @param dpTxn
     * @param userId
     * @param ipAdd
     * @param allUnitsFlag
     * @param orderId
     * @param orderVal
     * @param folioNo
     * @param fromSchemeCd
     * @param param2
     * @param param3
     * @param toSchemeCd
     * @param transNo
     * @param buySellType
     * @param switchUnits
     * @param passKey
     * @param memberId
     * @param subBrCode
     * @param minRedeem
     * @param transCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://bsestarmf.in/MFOrderEntry/switchOrderEntryParam")
    @WebResult(name = "switchOrderEntryParamResult", targetNamespace = "http://bsestarmf.in/")
    @RequestWrapper(localName = "switchOrderEntryParam", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.SwitchOrderEntryParam")
    @ResponseWrapper(localName = "switchOrderEntryParamResponse", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.SwitchOrderEntryParamResponse")
    public String switchOrderEntryParam(
        @WebParam(name = "TransCode", targetNamespace = "http://bsestarmf.in/")
        String transCode,
        @WebParam(name = "TransNo", targetNamespace = "http://bsestarmf.in/")
        String transNo,
        @WebParam(name = "OrderId", targetNamespace = "http://bsestarmf.in/")
        String orderId,
        @WebParam(name = "UserId", targetNamespace = "http://bsestarmf.in/")
        String userId,
        @WebParam(name = "MemberId", targetNamespace = "http://bsestarmf.in/")
        String memberId,
        @WebParam(name = "ClientCode", targetNamespace = "http://bsestarmf.in/")
        String clientCode,
        @WebParam(name = "FromSchemeCd", targetNamespace = "http://bsestarmf.in/")
        String fromSchemeCd,
        @WebParam(name = "ToSchemeCd", targetNamespace = "http://bsestarmf.in/")
        String toSchemeCd,
        @WebParam(name = "BuySell", targetNamespace = "http://bsestarmf.in/")
        String buySell,
        @WebParam(name = "BuySellType", targetNamespace = "http://bsestarmf.in/")
        String buySellType,
        @WebParam(name = "DPTxn", targetNamespace = "http://bsestarmf.in/")
        String dpTxn,
        @WebParam(name = "OrderVal", targetNamespace = "http://bsestarmf.in/")
        String orderVal,
        @WebParam(name = "SwitchUnits", targetNamespace = "http://bsestarmf.in/")
        String switchUnits,
        @WebParam(name = "AllUnitsFlag", targetNamespace = "http://bsestarmf.in/")
        String allUnitsFlag,
        @WebParam(name = "FolioNo", targetNamespace = "http://bsestarmf.in/")
        String folioNo,
        @WebParam(name = "Remarks", targetNamespace = "http://bsestarmf.in/")
        String remarks,
        @WebParam(name = "KYCStatus", targetNamespace = "http://bsestarmf.in/")
        String kycStatus,
        @WebParam(name = "SubBrCode", targetNamespace = "http://bsestarmf.in/")
        String subBrCode,
        @WebParam(name = "EUIN", targetNamespace = "http://bsestarmf.in/")
        String euin,
        @WebParam(name = "EUINVal", targetNamespace = "http://bsestarmf.in/")
        String euinVal,
        @WebParam(name = "MinRedeem", targetNamespace = "http://bsestarmf.in/")
        String minRedeem,
        @WebParam(name = "IPAdd", targetNamespace = "http://bsestarmf.in/")
        String ipAdd,
        @WebParam(name = "Password", targetNamespace = "http://bsestarmf.in/")
        String password,
        @WebParam(name = "PassKey", targetNamespace = "http://bsestarmf.in/")
        String passKey,
        @WebParam(name = "Parma1", targetNamespace = "http://bsestarmf.in/")
        String parma1,
        @WebParam(name = "Param2", targetNamespace = "http://bsestarmf.in/")
        String param2,
        @WebParam(name = "Param3", targetNamespace = "http://bsestarmf.in/")
        String param3);

    /**
     * 
     * @param startDate
     * @param euin
     * @param euinVal
     * @param transactionCode
     * @param clientCode
     * @param remarks
     * @param firstOrderFlag
     * @param password
     * @param dpc
     * @param internalRefNo
     * @param schemeCode
     * @param installmentAmount
     * @param ipAdd
     * @param regId
     * @param memberCode
     * @param noOfInstallment
     * @param folioNo
     * @param dpTxnMode
     * @param param1
     * @param param2
     * @param param3
     * @param frequencyType
     * @param uniqueRefNo
     * @param userID
     * @param transMode
     * @param subberCode
     * @param passKey
     * @param frequencyAllowed
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://bsestarmf.in/MFOrderEntry/sipOrderEntryParam")
    @WebResult(name = "sipOrderEntryParamResult", targetNamespace = "http://bsestarmf.in/")
    @RequestWrapper(localName = "sipOrderEntryParam", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.SipOrderEntryParam")
    @ResponseWrapper(localName = "sipOrderEntryParamResponse", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.SipOrderEntryParamResponse")
    public String sipOrderEntryParam(
        @WebParam(name = "TransactionCode", targetNamespace = "http://bsestarmf.in/")
        String transactionCode,
        @WebParam(name = "UniqueRefNo", targetNamespace = "http://bsestarmf.in/")
        String uniqueRefNo,
        @WebParam(name = "SchemeCode", targetNamespace = "http://bsestarmf.in/")
        String schemeCode,
        @WebParam(name = "MemberCode", targetNamespace = "http://bsestarmf.in/")
        String memberCode,
        @WebParam(name = "ClientCode", targetNamespace = "http://bsestarmf.in/")
        String clientCode,
        @WebParam(name = "UserID", targetNamespace = "http://bsestarmf.in/")
        String userID,
        @WebParam(name = "InternalRefNo", targetNamespace = "http://bsestarmf.in/")
        String internalRefNo,
        @WebParam(name = "TransMode", targetNamespace = "http://bsestarmf.in/")
        String transMode,
        @WebParam(name = "DpTxnMode", targetNamespace = "http://bsestarmf.in/")
        String dpTxnMode,
        @WebParam(name = "StartDate", targetNamespace = "http://bsestarmf.in/")
        String startDate,
        @WebParam(name = "FrequencyType", targetNamespace = "http://bsestarmf.in/")
        String frequencyType,
        @WebParam(name = "FrequencyAllowed", targetNamespace = "http://bsestarmf.in/")
        String frequencyAllowed,
        @WebParam(name = "InstallmentAmount", targetNamespace = "http://bsestarmf.in/")
        String installmentAmount,
        @WebParam(name = "NoOfInstallment", targetNamespace = "http://bsestarmf.in/")
        String noOfInstallment,
        @WebParam(name = "Remarks", targetNamespace = "http://bsestarmf.in/")
        String remarks,
        @WebParam(name = "FolioNo", targetNamespace = "http://bsestarmf.in/")
        String folioNo,
        @WebParam(name = "FirstOrderFlag", targetNamespace = "http://bsestarmf.in/")
        String firstOrderFlag,
        @WebParam(name = "SubberCode", targetNamespace = "http://bsestarmf.in/")
        String subberCode,
        @WebParam(name = "Euin", targetNamespace = "http://bsestarmf.in/")
        String euin,
        @WebParam(name = "EuinVal", targetNamespace = "http://bsestarmf.in/")
        String euinVal,
        @WebParam(name = "DPC", targetNamespace = "http://bsestarmf.in/")
        String dpc,
        @WebParam(name = "RegId", targetNamespace = "http://bsestarmf.in/")
        String regId,
        @WebParam(name = "IPAdd", targetNamespace = "http://bsestarmf.in/")
        String ipAdd,
        @WebParam(name = "Password", targetNamespace = "http://bsestarmf.in/")
        String password,
        @WebParam(name = "PassKey", targetNamespace = "http://bsestarmf.in/")
        String passKey,
        @WebParam(name = "Param1", targetNamespace = "http://bsestarmf.in/")
        String param1,
        @WebParam(name = "Param2", targetNamespace = "http://bsestarmf.in/")
        String param2,
        @WebParam(name = "Param3", targetNamespace = "http://bsestarmf.in/")
        String param3);

    /**
     * 
     * @param startDate
     * @param euin
     * @param euinVal
     * @param transactionCode
     * @param clientCode
     * @param brokerage
     * @param remarks
     * @param firstOrderFlag
     * @param password
     * @param dpc
     * @param internalRefNo
     * @param mandateID
     * @param userId
     * @param schemeCode
     * @param ipAdd
     * @param installmentAmount
     * @param xsipRegID
     * @param memberCode
     * @param noOfInstallment
     * @param folioNo
     * @param dpTxnMode
     * @param param1
     * @param param2
     * @param param3
     * @param frequencyType
     * @param uniqueRefNo
     * @param transMode
     * @param subberCode
     * @param passKey
     * @param frequencyAllowed
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://bsestarmf.in/MFOrderEntry/xsipOrderEntryParam")
    @WebResult(name = "xsipOrderEntryParamResult", targetNamespace = "http://bsestarmf.in/")
    @RequestWrapper(localName = "xsipOrderEntryParam", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.XsipOrderEntryParam")
    @ResponseWrapper(localName = "xsipOrderEntryParamResponse", targetNamespace = "http://bsestarmf.in/", className = "in.bsestarmf.XsipOrderEntryParamResponse")
    public String xsipOrderEntryParam(
        @WebParam(name = "TransactionCode", targetNamespace = "http://bsestarmf.in/")
        String transactionCode,
        @WebParam(name = "UniqueRefNo", targetNamespace = "http://bsestarmf.in/")
        String uniqueRefNo,
        @WebParam(name = "SchemeCode", targetNamespace = "http://bsestarmf.in/")
        String schemeCode,
        @WebParam(name = "MemberCode", targetNamespace = "http://bsestarmf.in/")
        String memberCode,
        @WebParam(name = "ClientCode", targetNamespace = "http://bsestarmf.in/")
        String clientCode,
        @WebParam(name = "UserId", targetNamespace = "http://bsestarmf.in/")
        String userId,
        @WebParam(name = "InternalRefNo", targetNamespace = "http://bsestarmf.in/")
        String internalRefNo,
        @WebParam(name = "TransMode", targetNamespace = "http://bsestarmf.in/")
        String transMode,
        @WebParam(name = "DpTxnMode", targetNamespace = "http://bsestarmf.in/")
        String dpTxnMode,
        @WebParam(name = "StartDate", targetNamespace = "http://bsestarmf.in/")
        String startDate,
        @WebParam(name = "FrequencyType", targetNamespace = "http://bsestarmf.in/")
        String frequencyType,
        @WebParam(name = "FrequencyAllowed", targetNamespace = "http://bsestarmf.in/")
        String frequencyAllowed,
        @WebParam(name = "InstallmentAmount", targetNamespace = "http://bsestarmf.in/")
        String installmentAmount,
        @WebParam(name = "NoOfInstallment", targetNamespace = "http://bsestarmf.in/")
        String noOfInstallment,
        @WebParam(name = "Remarks", targetNamespace = "http://bsestarmf.in/")
        String remarks,
        @WebParam(name = "FolioNo", targetNamespace = "http://bsestarmf.in/")
        String folioNo,
        @WebParam(name = "FirstOrderFlag", targetNamespace = "http://bsestarmf.in/")
        String firstOrderFlag,
        @WebParam(name = "Brokerage", targetNamespace = "http://bsestarmf.in/")
        String brokerage,
        @WebParam(name = "MandateID", targetNamespace = "http://bsestarmf.in/")
        String mandateID,
        @WebParam(name = "SubberCode", targetNamespace = "http://bsestarmf.in/")
        String subberCode,
        @WebParam(name = "Euin", targetNamespace = "http://bsestarmf.in/")
        String euin,
        @WebParam(name = "EuinVal", targetNamespace = "http://bsestarmf.in/")
        String euinVal,
        @WebParam(name = "DPC", targetNamespace = "http://bsestarmf.in/")
        String dpc,
        @WebParam(name = "XsipRegID", targetNamespace = "http://bsestarmf.in/")
        String xsipRegID,
        @WebParam(name = "IPAdd", targetNamespace = "http://bsestarmf.in/")
        String ipAdd,
        @WebParam(name = "Password", targetNamespace = "http://bsestarmf.in/")
        String password,
        @WebParam(name = "PassKey", targetNamespace = "http://bsestarmf.in/")
        String passKey,
        @WebParam(name = "Param1", targetNamespace = "http://bsestarmf.in/")
        String param1,
        @WebParam(name = "Param2", targetNamespace = "http://bsestarmf.in/")
        String param2,
        @WebParam(name = "Param3", targetNamespace = "http://bsestarmf.in/")
        String param3);

}