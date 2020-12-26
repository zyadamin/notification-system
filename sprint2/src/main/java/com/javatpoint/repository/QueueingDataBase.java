package com.javatpoint.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Repository;


//repository that extends CrudRepository
@Repository
public class QueueingDataBase {
	 String url = "jdbc:mysql://localhost:3306/notificationtemblete";
	 
	 String user = "zyad";
	 String password = "123";
	 Connection Con = null; 
     ResultSet RS=null;
     public  QueueingDataBase() throws SQLException {
    	 
    	 
 	    Con = DriverManager.getConnection(url, user, password);

    	 
    	 
     }
     
     

	public boolean saveEmail(int templete_id, String content, String mail  ) 
	{
		int result=0;

	
		String query = "INSERT INTO `notifiwithmail` (`id`,`content`, `mail`,`templete_id`)"
		        + " values (?, ?, ?, ?)";
		try {
	 PreparedStatement preparedStmt = Con.prepareStatement(query);

	 preparedStmt.setInt(1, 3);
	 preparedStmt.setString(2,content);
	 preparedStmt.setString(3,mail);
	 preparedStmt.setInt(4,templete_id);
	  
	  result=preparedStmt.executeUpdate();

	 
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if(result!=0){
	   	 return true;
	   }
		
		return false;
}

	public boolean saveSMS(int templete_id, String content, String number ) 
	{
		int result=0;

		String query = "INSERT INTO `notifiwithsms` (`id`,`content`, `number`,`templete_id`)"
		        + " values (?, ?, ?, ?)";
		try {
		PreparedStatement preparedStmt = Con.prepareStatement(query);

		preparedStmt.setInt(1, 3);
		preparedStmt.setString(2,content);
		preparedStmt.setString(3,number);
		preparedStmt.setInt(4,templete_id);

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
