package com.javatpoint.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sendSms extends dequeue{

	public sendSms() throws SQLException {
		super();
	}

	@Override
	public void send() {
		
		int result=0;
		ResultSet RS=null;
		PreparedStatement ps;
		PreparedStatement ps1;

		try {
			ps = Con.prepareStatement("select * from notifiwithsms");
			RS=ps.executeQuery();
			String number="";
			String statue="";
			while(RS.next()) {
			
				number=RS.getString("number");
				if(number.charAt(0)=='0'&&number.charAt(1)=='1'&&number.length()==11) {
				statue="success";	
				}
				else {
					statue="failed";
				}
			
				ps1 = Con.prepareStatement("UPDATE notifiwithsms SET `statue`=?  where number =?");
				
			    ps1.setString(1, statue);
			    ps1.setString(2, number);
			    ps1.executeUpdate();	
			}


			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
		
		
		
	

}
