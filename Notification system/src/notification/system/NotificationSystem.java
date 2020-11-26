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
public class NotificationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 NotificationTemplates x =new NotificationTemplates();
 
 
 x.create("confirmation"," hellow dear * your booking ","english");

 
  x.update("confirmation", "hellow","english");
  
  x.create("confirmation","اي حاجة","arabic");
  
 
     String y=x.read("confirmation","english");
 
       // System.out.println(y);
        
        
        x.create("forget password", "send code ** to recover your account", "english");
    
        x.readAll("confirmation");
        
        x.delete("confirmation");
        x.read("confirmation","english");
        
        

    }
    
}
