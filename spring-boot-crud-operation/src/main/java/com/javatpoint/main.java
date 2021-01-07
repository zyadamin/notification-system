package com.javatpoint;


import com.javatpoint.repository.sendEmail;
import com.javatpoint.repository.sendSms;

import java.sql.SQLException;


public class main {
	public static void main(String[] args) throws SQLException  {
		
		
	sendEmail x = new sendEmail();	
	x.send();

	sendSms y= new sendSms();
	y.send();
	
	}
}
