
package wsdl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EnterpriseSMSWS", targetNamespace = "https://ws.esms.mobitel.lk/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EnterpriseSMSWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "serviceTest", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.ServiceTest")
    @ResponseWrapper(localName = "serviceTestResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.ServiceTestResponse")
    public String serviceTest(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param user
     * @return
     *     returns wsdl.Session
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createSession", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.CreateSession")
    @ResponseWrapper(localName = "createSessionResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.CreateSessionResponse")
    public Session createSession(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param session
     * @param status
     * @return
     *     returns wsdl.Session
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "renewSession", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.RenewSession")
    @ResponseWrapper(localName = "renewSessionResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.RenewSessionResponse")
    public Session renewSession(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "status", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> status);

    /**
     * 
     * @param session
     */
    @WebMethod
    @RequestWrapper(localName = "closeSession", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.CloseSession")
    @ResponseWrapper(localName = "closeSessionResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.CloseSessionResponse")
    public void closeSession(
        @WebParam(name = "session", targetNamespace = "")
        Session session);

    /**
     * 
     * @param session
     * @param status
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isSession", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.IsSession")
    @ResponseWrapper(localName = "isSessionResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.IsSessionResponse")
    public Boolean isSession(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "status", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> status);

    /**
     * 
     * @param smsMessage
     * @param session
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendMessages", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.SendMessages")
    @ResponseWrapper(localName = "sendMessagesResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.SendMessagesResponse")
    public int sendMessages(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "smsMessage", targetNamespace = "")
        SmsMessage smsMessage);

    /**
     * 
     * @param smsMultipleMessage
     * @param session
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendMultipleMessages", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.SendMultipleMessages")
    @ResponseWrapper(localName = "sendMultipleMessagesResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.SendMultipleMessagesResponse")
    public String sendMultipleMessages(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "smsMultipleMessage", targetNamespace = "")
        SmsMultipleMessage smsMultipleMessage);

    /**
     * 
     * @param session
     * @param smsMessageMultiLang
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendMessagesMultiLang", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.SendMessagesMultiLang")
    @ResponseWrapper(localName = "sendMessagesMultiLangResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.SendMessagesMultiLangResponse")
    public int sendMessagesMultiLang(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "smsMessageMultiLang", targetNamespace = "")
        SmsMessageMultiLang smsMessageMultiLang);

    /**
     * 
     * @param smsCampaignMessage
     * @param session
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendCampaignMessages", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.SendCampaignMessages")
    @ResponseWrapper(localName = "sendCampaignMessagesResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.SendCampaignMessagesResponse")
    public int sendCampaignMessages(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "smsCampaignMessage", targetNamespace = "")
        SmsCampaignMessage smsCampaignMessage);

    /**
     * 
     * @param session
     * @param shortcode
     * @return
     *     returns java.util.List<wsdl.SmsMessage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessagesFromShortcode", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.GetMessagesFromShortcode")
    @ResponseWrapper(localName = "getMessagesFromShortcodeResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.GetMessagesFromShortcodeResponse")
    public List<SmsMessage> getMessagesFromShortcode(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "shortcode", targetNamespace = "")
        String shortcode);

    /**
     * 
     * @param session
     * @param longNumber
     * @return
     *     returns java.util.List<wsdl.SmsMessage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessagesFromLongNumber", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.GetMessagesFromLongNumber")
    @ResponseWrapper(localName = "getMessagesFromLongNumberResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.GetMessagesFromLongNumberResponse")
    public List<SmsMessage> getMessagesFromLongNumber(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "longNumber", targetNamespace = "")
        String longNumber);

    /**
     * 
     * @param endDate
     * @param session
     * @param alias
     * @param startDate
     * @return
     *     returns java.util.List<wsdl.SentMessages>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSentMessageReports", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.GetSentMessageReports")
    @ResponseWrapper(localName = "getSentMessageReportsResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.GetSentMessageReportsResponse")
    public List<SentMessages> getSentMessageReports(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "startDate", targetNamespace = "")
        String startDate,
        @WebParam(name = "endDate", targetNamespace = "")
        String endDate,
        @WebParam(name = "alias", targetNamespace = "")
        String alias);

    /**
     * 
     * @param session
     * @param alias
     * @return
     *     returns java.util.List<wsdl.SmsMessage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDeliveryReports", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.GetDeliveryReports")
    @ResponseWrapper(localName = "getDeliveryReportsResponse", targetNamespace = "https://ws.esms.mobitel.lk/", className = "wsdl.GetDeliveryReportsResponse")
    public List<SmsMessage> getDeliveryReports(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "alias", targetNamespace = "")
        String alias);

}
