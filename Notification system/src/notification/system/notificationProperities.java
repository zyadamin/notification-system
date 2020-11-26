/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notification.system;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class notificationProperities {
     String type;
    ArrayList<String> Language=new ArrayList<>();
    ArrayList<String>templete=new ArrayList<>();
    

    public notificationProperities() {
        
    }

    
    public void setTemplete(String templete) {
        this.templete.add(templete);
    }
    
   public String getTemplete(String Language) {
       boolean exist=false;
        for(int i=0;i<Language.length();i++){
if(this.Language.get(i).equals(Language)){
            return templete.get(i);}
        }
        return null;
   }
   
    public void setLanguage(String Language) {
        this.Language.add(Language);
    }
    
    public boolean getLanguage(String Language) {
       for(int i=0;i<Language.length();i++){
        if(this.Language.get(i).equals(Language)){
            return true;
        }}
         
      return false;
     }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
