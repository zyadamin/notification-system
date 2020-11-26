/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notification.system;

import java.util.ArrayList;

/**
 *
 * @author zezo
 */
public class NotificationTemplates {
    
    
   ArrayList<notificationProperities> notifi= new ArrayList<>();

   
    public void create(String type ,String template ,String Language){
        
       boolean exist=false;
      int  index=0;
    
  for(int i=0;i<notifi.size();i++){
     if(type.equals(notifi.get(i).getType())){
      exist=true;
      index=i;
     }
   }
  
  if(exist){ 

  
   if(notifi.get(index).getLanguage(Language)){
       System.out.println("Templete already exist");
   }
   
   else{
  notifi.get(index).setTemplete(template);
  notifi.get(index).setLanguage(Language);
  
  }
  }
  
  
  else{
  notificationProperities newOne=new notificationProperities();
  newOne.setType(type);
  newOne.setTemplete(template);
  newOne.setLanguage(Language);
  notifi.add(newOne);
  }
  
  

  
  }
   

    
    
    
   public void update(String type ,String template,String Language ){
       boolean exist=false;
        int index=0;
   for(int i=0;i<this.notifi.size();i++){
   if(this.notifi.get(i).getType().equals(type)&&this.notifi.get(i).getLanguage(Language)){
       exist=true;
       index=i;
   }    
   if(exist){
       this.notifi.get(index).setTemplete(template);}
   else{
       System.out.println("Templete Not exist");
   }
    }
   }
   
   
   public void delete(String type){
  
   boolean exist=false;
        int index=0;
   for(int i=0;i<this.notifi.size();i++){
   if(this.notifi.get(i).getType().equals(type)){
       exist=true;
       index=i;
   }    
   if(exist){
       this.notifi.remove(index);}
   else{
       System.out.println("Type Not exist");
   }
    }
   }    

    
   
   
   public String read(String type,String Language){
  
    boolean exist=false;
        int index=0;
   for(int i=0;i<this.notifi.size();i++){
   if(this.notifi.get(i).getType().equals(type)&&this.notifi.get(i).getLanguage(Language)){
       exist=true;
       index=i;
   }    
   if(exist){
     return this.notifi.get(index).getTemplete(Language);}
   else{
       System.out.println("Templete Not exist");
   }
    }  
    
    return  "not found";
    }
   
    
    
   
    
}
