package com.javatpoint.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.javatpoint.model.Language;
import com.javatpoint.model.Method;
import com.javatpoint.model.Type;
import com.javatpoint.model.notificationTemplate;

public class File {
	
	  ArrayList<notificationTemplate>templates = new ArrayList<>();
	    
	  //   notoficationQueue x;
	    public void create(notificationTemplate temp){
	     
	     templates.add(temp);
	     
	     }
	     
	    
	     public void update(int id){
	         
	         System.out.println("what to update ?");
	         System.out.println("1-Type ");
	         System.out.println("2-Content");
	         System.out.println("3-Method");
	         System.out.println("4-Language");
	         Scanner input = new Scanner(System.in);
	         
	        int choose= input.nextInt();
	        int num=0;
	         for(int i=0;i<templates.size();i++){
	         
	         if(templates.get(i).getId()==id){
	         num=i;
	         break;
	         }
	         }
	         
	         if(choose==1){
	             System.out.println("enter new type");
	             String type=input.next();
	             
	            while(Type.toString(type)==Type.notfound){
	              System.out.println("enter valid type");   
	                type=input.next();   
	            }
	            
	           templates.get(num).setType(Type.toString(type));
	             
	         }
	         
	         else if(choose==2){
	           
	          System.out.println("enter new content");
	          String content=input.nextLine();
	          
	          templates.get(num).setContent(content);
	           }      

	      else if(choose==3){
	            System.out.println("enter new method");
	             String method=input.next();
	             
	            while(Method.toString(method)==Method.notfound){
	              System.out.println("enter valid method");   
	                method=input.next();   
	            }
	            
	           templates.get(num).setMethod(Method.toString(method));

	     
	     }

	     else if(choose==4){
	     
	           System.out.println("enter new language");
	             String language=input.next();
	             
	            while(Language.toString(language)==Language.notfound){
	              System.out.println("enter valid language");   
	                language=input.next();   
	            }
	            
	           templates.get(num).setLanguage(Language.toString(language));
	     
	     }
	     
	     
	     }
	     
	      public void delete(int id){
	      
	      templates.remove(id);
	      }
	     
	      public notificationTemplate Read(int id) {
	    	  
	    	  notificationTemplate x=new notificationTemplate();
	    	  for(int i=0;i<templates.size();i++){
	 	         
	 	         if(templates.get(i).getId()==id){
	 	        	 return templates.get(i);
	 	         }}
	    	  return x;
	    	  }
	      public void writeIntoFile() throws IOException{
	    	    FileWriter write= new FileWriter("templates.txt");
	    	    for(int i=0;i<templates.size();i++){
	    	    	write.write(templates.get(i).getId()+"\n");
	    	    	write.write(templates.get(i).getType()+"\n");
	    	    	write.write(templates.get(i).getContent()+"\n");
	    	    	write.write(templates.get(i).getLanguage()+"\n");  	
	    	    	write.write(templates.get(i).getMethod()+"\n");
	    	    
	    	    }
	    	write.close();
	    	}
public void Read() throws FileNotFoundException {
	FileReader read= new FileReader("templates.txt");
    Scanner input=new Scanner(read);
    
    String type="",x="";
   
while(input.hasNext()) {
	for(int i=0;i<5;i++){
		
	}
	}
}

	     
	  /*  public  notificationTemplate replacment(int id,String[] replace){
	   int num=0;
	        
	   for(int i=0;i<templates.size();i++){
	     if(templates.get(i).getId()==id){
	    num=i;
	  }
	  }
	        
	        notificationTemplate newOne=new notificationTemplate(templates.get(num));
	        String newContent=newOne.getContent();
	     
	 for(int j=0;j<replace.length;j++){
	     for(int i=0;i<newContent.length();i++){
	         
	    if(newContent.charAt(j)=='*'){
	     newContent=newContent.substring(0, i)+replace[j]+newContent.substring(i+1, newContent.length());
	     break;
	  }
	  }
	     
	 }
	 newOne.setContent(newContent);
	      
	   return  newOne;
	   
	     
	 }*/

	   /* public void send() {
	 	   x.insert();
	 	   
	    }*/
	    
	      
}
