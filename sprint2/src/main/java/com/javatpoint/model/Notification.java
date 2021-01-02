package com.javatpoint.model;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.javatpoint.repository.NotificationDataBase;
import com.javatpoint.repository.QueueingDataBase;
@Repository
public class Notification {
	
	int template_id;
	String[] replacment;
	String method;
	
	NotificationDataBase myData;  
	QueueingDataBase export;	
	public Notification(){
		
	}
	
public int getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(int template_id) {
		this.template_id = template_id;
	}

	public String[] getReplacment() {
		return replacment;
	}

	public void setReplacment(String[] replacment) {
		this.replacment = replacment;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String mail) {
		this.method = mail;
	}

	
	
public  String replace(String[] replace ,String content){
     
		 for(int j=0;j<replace.length;j++){
		     for(int i=0;i<content.length();i++){
		         
		    if(content.charAt(i)=='*'){
		    	content=content.substring(0, i)+replace[j]+content.substring(i+1, content.length());
		     break;
		  }
		  }
		     
		 }

return  content;
 }
	

public boolean getData(Notification y ){
	
	Method myMethod = null;
	String content=null;

	
		try {
			myData = new NotificationDataBase();
			export= new QueueingDataBase();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		 content=myData.Read(y.template_id).getContent();
		 myMethod=myData.Read(y.template_id).getMethod();

	content= this.replace(y.replacment, content);
	
	
if(myMethod.equals(Method.email)) {
	
return  export.saveEmail(y.getTemplate_id(), content, y.getMethod());
	
}

if(myMethod.equals(Method.sms)) {

	return export.saveSMS(y.getTemplate_id(), content, y.getMethod());
}
return false;


}



}



