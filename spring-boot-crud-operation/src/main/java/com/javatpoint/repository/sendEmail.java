package com.javatpoint.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.*;    
import javax.mail.internet.*;  

public class sendEmail extends dequeue{

	public sendEmail() throws SQLException {
		super();

	}

	@Override
	public void send() {
		ResultSet RS=null;
		PreparedStatement ps;
		PreparedStatement ps1;

		try {
			ps = Con.prepareStatement("SELECT * FROM `notifiwithmail` WHERE statue is null");

			RS=ps.executeQuery();
			int id=0;

			String email="";
			String statue="";
			String content="";
			while(RS.next()) {
				
				id=RS.getInt("id");
				email=RS.getString("mail");
				content=RS.getString("content");
				if(email.contains("@")&&email.contains(".com")) {
				statue="success";	
                 Gmail(email,"notification system",content);
				}
				else {
					statue="failed";
				}
			
				ps1 = Con.prepareStatement("UPDATE notifiwithmail SET `statue`=?  where id =?");
				
			    ps1.setString(1, statue);
			    ps1.setInt(2,id);
			    ps1.executeUpdate();	
			}


			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

public void Gmail(String to,String sub,String msg) {
	
	
	String from="notificationsystem658@gmail.com";
	String password="123456System";

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
    
       
	
	
}
	
}
