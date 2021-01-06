package com.javatpoint.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sendEmail extends dequeue{

	public sendEmail() throws SQLException {
		super();

	}

	@Override
	public void send() {
		int result=0;
		ResultSet RS=null;
		PreparedStatement ps;
		PreparedStatement ps1;

		try {
			ps = Con.prepareStatement("select * from notifiwithmail");
			RS=ps.executeQuery();
			String email="";
			String statue="";
			while(RS.next()) {
			
				email=RS.getString("mail");
				if(email.contains("@")&&email.contains(".com")) {
				statue="success";	
				}
				else {
					statue="failed";
				}
			
				ps1 = Con.prepareStatement("UPDATE notifiwithmail SET `statue`=?  where mail =?");
				
			    ps1.setString(1, statue);
			    ps1.setString(2, email);
			    ps1.executeUpdate();	
			}


			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
