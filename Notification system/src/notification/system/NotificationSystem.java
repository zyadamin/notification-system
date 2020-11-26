/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notification.system;

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
 
 
 x.create("confirmation", "hellow dear *","english");

 
  x.update("confirmation", "hellow dear *","englisaah");

 /*
String y=x.read("confirmation","english");
 
        System.out.println(y);
    
*/
   
        
        
    

    }
    
}
