/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint2;


/**
 *
 * @author zezo
 */
public enum Method {
    email,sms,notfound;
    
    public static Method toString(String x){

switch(x){

case "email":  return email;
case "EMAIL":  return email;

case "sms": return sms;
case "SMS": return sms;


default: return notfound;
}

    }
    
    
    
}
