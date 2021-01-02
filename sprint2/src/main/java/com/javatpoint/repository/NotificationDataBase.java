package com.javatpoint.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.javatpoint.model.Language;
import com.javatpoint.model.Method;
import com.javatpoint.model.Type;
import com.javatpoint.model.criteria;
//repository that extends CrudRepository
import com.javatpoint.model.notificationTemplate;


@Repository
public class NotificationDataBase implements notificationModule
{
	 String url = "jdbc:mysql://localhost:3306/notificationtemblete"; 
	 String user = "zyad";
	 String password = "123";
	 Connection Con = null; 
     ResultSet RS=null;
	
     public NotificationDataBase() throws SQLException {
	
    Con = DriverManager.getConnection(url, user, password);

	}
     
    
     
	@Override
	public boolean create(notificationTemplate x)   {
	
		int result=0;
		String query = "INSERT INTO `templete` (`id`, `type`, `content`, `language`,`method`)"
    	        + " values (?, ?, ?, ?,?)";
		try {
     PreparedStatement preparedStmt = Con.prepareStatement(query);

     preparedStmt.setInt(1, x.getId());
     preparedStmt.setInt(2, x.getType().getMyType());
     preparedStmt.setString(3, x.getContent());
     preparedStmt.setInt(4, x.getLanguage().getMyLanguage());
     preparedStmt.setInt(5, x.getMethod().getMyMethod());


     result=preparedStmt.executeUpdate();
  
     
		} catch (SQLException e) {

			e.printStackTrace();
		}
		   if(result!=0){
		    	 return true;
		    }
		     else{

		return false;     }   

	}

	
	@Override
	public boolean update(notificationTemplate x) {
		int result=0;
		PreparedStatement ps;
		try {
			ps = Con.prepareStatement("UPDATE `templete` SET `id`=?,`type`=?,`content`=?,`language`=?,`method`=? where `id`=?");
	
			ps.setInt(1, x.getId());
		    ps.setInt(2, x.getType().getMyType());
		    ps.setString(3, x.getContent());
		    ps.setInt(4, x.getLanguage().getMyLanguage());
		    ps.setInt(5, x.getMethod().getMyMethod());
		result=	ps.executeUpdate();	
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		   if(result!=0){
		    	 return true;
		    }
		     else{

		return false;     
		}	    	
	}

	@Override
	public boolean delete(int id) {
int result=0;

		
PreparedStatement ps;
try {
	ps = Con.prepareStatement("DELETE FROM templete WHERE id = ?");

	ps.setInt(1,id);
	result=ps.executeUpdate();
}
catch (SQLException e) {
	e.printStackTrace();
}
   if(result!=0){
		    	 return true;
		    }
		     else{

		return false;     }
	}

	
	
	@Override
	public notificationTemplate Read(int id) {
		PreparedStatement ps;
		notificationTemplate x=new notificationTemplate();
		try {
			
			ps = Con.prepareStatement("select * from templete where id=?");
			ps.setInt(1, id);
			RS=ps.executeQuery();
			
			if(RS.next()) {
				x.setId(RS.getInt("id"));
				x.setContent(RS.getString("content"));
				x.setLanguage(Language.getLanguage(RS.getInt("language")));
				x.setMethod(Method.getMethod(RS.getInt("method")));
				
				x.setType(Type.getType(RS.getInt("type")));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;

		
	}

	@Override
	public ArrayList<notificationTemplate> Search(criteria search) {
		
		ArrayList<notificationTemplate> myList = new ArrayList<notificationTemplate>();
		PreparedStatement ps;

		if(search.equals(criteria.arabic)) {
			
			try {
				ps = Con.prepareStatement("select * from templete where language=0 ");
				RS=ps.executeQuery();

			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}
		
		
		else if(search.equals(criteria.english)){
			
			try {
				ps = Con.prepareStatement("select * from templete where language=1 ");
				RS=ps.executeQuery();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		else if(search.equals(criteria.email)){
			
			try {
				ps = Con.prepareStatement("select * from templete where method=0 ");
				RS=ps.executeQuery();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		else if(search.equals(criteria.sms)){
			
			try {
				ps = Con.prepareStatement("select * from templete where method=1");
				RS=ps.executeQuery();

			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		}

		
		else if(search.equals(criteria.confirmation)){
			
			try {
				ps = Con.prepareStatement("select * from templete where type=0 ");
				RS=ps.executeQuery();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		
		else if(search.equals(criteria.booking)){
			
			try {
				ps = Con.prepareStatement("select * from templete where type=1 ");
				RS=ps.executeQuery();

			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		}
		
		else if(search.equals(criteria.forgetpassword)){
			
			try {
				ps = Con.prepareStatement("select * from templete where type=2");
				RS=ps.executeQuery();

			} catch (SQLException e) {
				e.printStackTrace();
			}

			
		}
		

try {
			
		   while(RS.next()) {
		notificationTemplate temp= new notificationTemplate();
			   temp.setId(RS.getInt("id"));
			   temp.setContent(RS.getString("content"));
			   temp.setLanguage(Language.getLanguage(RS.getInt("language")));
			   temp.setMethod(Method.getMethod(RS.getInt("method")));			
			   temp.setType(Type.getType(RS.getInt("type")));
	
			   myList.add(temp);
			   
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	

   return myList;
	}

	
}
