/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esmsclient;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.Holder;
import lk.mobitel.esms.message.SMSManager;
import lk.mobitel.esms.session.NullSessionException;
import lk.mobitel.esms.session.SessionManager;
import lk.mobitel.esms.test.*;
import wsdl.EnterpriseSMSWS;
import wsdl.SentMessages;
import wsdl.Session;
import wsdl.SmsCampaignMessage;
import wsdl.SmsMessage;
import wsdl.SmsMessageMultiLang;
import wsdl.SmsMultipleMessage;
import wsdl.User;

/**
 *
 * @author difnaj
 */
public class ESMSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String userName="XXX";
        String password="YYYY";
        String userAlias="TEST";
        String number="071XXXXXXX";
        String message="This is test message";
        String promo="YES";
        String output;
        
         //create user object
        User user = new User();
        user.setUsername(userName);
        user.setPassword(password);
        
        //test Service method
        ServiceTest test=new ServiceTest();
        System.out.println(test.testService(user));
       
        //session handling
        SessionManager sm = SessionManager.getInstance();
        sm.login(user);
        
        Boolean logged= sm.isSession();
        System.out.println("log status = " + logged);
        
        //message sending
        SmsMessage msg = new SmsMessage();
        msg.setMessage("test");
        msg.setSender(userAlias);
        msg.getRecipients().add(number);
        msg.setMessageType(1);

        
        SMSManager smsManager=new SMSManager();
        try {
           int result= smsManager.sendMessage(msg);
            System.out.println("MessageSend Result = " + result);
            
        } catch (NullSessionException ex) {
            Logger.getLogger(ESMSClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        try {
            //////////////////////////////////////////////
            List<SmsMessage> deliveryReports= smsManager.getDeliveryReports(userAlias);
            
            
        } catch (NullSessionException ex) {
            Logger.getLogger(ESMSClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sm.logout();
        Boolean logStatus2= sm.isSession();
        System.out.println("log status2 = " + logStatus2);
       
        
        
    }
    
}
