package com.javatpoint.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class saveSms extends queueDatebase{

	public saveSms() throws SQLException {
		super();
	}

	@Override
	public boolean save(String content, String number) {
		int result=0;

		String query = "INSERT INTO `notifiwithsms` (`content`, `number`)"
		        + " values (?, ?)";
		try {
		PreparedStatement preparedStmt = Con.prepareStatement(query);

		preparedStmt.setString(1,content);
		preparedStmt.setString(2,number);

		result=preparedStmt.executeUpdate();


		} catch (SQLException e) {

			e.printStackTrace();
		}
		if(result!=0){
			 return true;
		}
	
		return false;
  }
	}


