package com.javatpoint.repository;

import java.util.ArrayList;

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
	     
	     
	    public  notificationTemplate replacment(int id,String[] replace){
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
	   
	     
	 }

	   /* public void send() {
	 	   x.insert();
	 	   
	    }*/
	    
	      
}
