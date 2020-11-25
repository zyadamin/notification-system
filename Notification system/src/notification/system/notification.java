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
public class notification {
    
    
    NotificationTemplates managment = new NotificationTemplates();  
    
    public  void  mange(String type ,String[] replace ,String method,String email){
    
    
    
    String template =managment.read(type);
    

    String notification=this.replacement(replace, template);
    
    
    
    }
    
    
    
    public  String replacement(String[] replace, String template ){
    
    
    
for(int j=0;j<replace.length;j++){
 for(int i=0;i<template.length();i++){
   if(template.charAt(i)=='*'){
    template=template.substring(0, i)+replace[j]+template.substring(i+1, template.length());
    break;
 }
 }
    
}
    
    
  return  template;
    
}


}