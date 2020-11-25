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
    
    
    ArrayList<String> type= new ArrayList<>();
    ArrayList<String> template= new ArrayList<>();
    
    
    public void create(String type ,String template ){
  
    this.type.add(type);
    this.template.add(template);

    }
    
    
   public void updte(String type ,String template ){
  
   for(int i=0;i<this.type.size();i++){
   
   if(this.type.get(i).equals(type)){this.template.set(i,template);}
   }    

    }
   
   
   public void delete(String type){
  
   for(int i=0;i<this.type.size();i++){
   
   if(this.type.get(i).equals(type)){
       this.type.remove(i);
       this.template.remove(i);
   
   }
   }    

    }
   
   
   public String read(String type){
  
   for(int i=0;i<this.type.size();i++){
   
   if(this.type.get(i).equals(type)){
      return this.template.get(i);

   }
   }    
       
    
return  "not found";
    }
   
    
    
}
