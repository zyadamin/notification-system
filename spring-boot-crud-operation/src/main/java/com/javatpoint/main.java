package com.javatpoint;


import com.javatpoint.repository.sendEmail;
import com.javatpoint.repository.sendSms;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;  

public class main {
	public static void main(String[] args)  {
		/*
		String from="zezoamen0@gmail.com";
		String password="123456Zyad";
		String to="szzz123t0@gmail.com";
		String sub="test";
		String msg="hello";
		 //Get properties object    
        Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        //get Session   
        Session session = Session.getDefaultInstance(props,    
         new javax.mail.Authenticator() {    
         protected PasswordAuthentication getPasswordAuthentication() {    
         return new PasswordAuthentication(from,password);  
         }    
        });    
        //compose message    
        try {    
         MimeMessage message = new MimeMessage(session);    
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
         message.setSubject(sub);    
         message.setText(msg);    
         //send message  
         Transport.send(message);    
         System.out.println("message sent successfully");    
        } catch (MessagingException e) {throw new RuntimeException(e);}    
        
           */
		
//	sendEmail x = new sendEmail();	
//	x.send();

	//sendSms y= new sendSms();
	//y.send();
	
	}
}
