/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.model;


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
    public  int getMyMethod() {
    	
    	switch(this){

    	case email:  return 0;

    	case sms: return 1;


    	default: return -1;
    	}
    	
    }
    public static Method getMethod(int x) {
    	
    	switch(x){

    	case 0:  return email;

    	case 1: return sms;


    	default: return notfound;
    	}
    	
    }
    
    
    
    
}
