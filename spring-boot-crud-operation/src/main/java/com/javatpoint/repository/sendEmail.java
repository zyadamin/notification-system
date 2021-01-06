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
				}else {
					statue="failed";
				}
			}

			ps1 = Con.prepareStatement("UPDATE `templete` SET `content`=?,`language`=? where `type`=?");
	
		    ps.setString(1, x.getContent());
		    ps.setInt(2, x.getLanguage().getMyLanguage());
		    ps.setInt(3, x.getType().getMyType());

			ps.executeUpdate();	
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
