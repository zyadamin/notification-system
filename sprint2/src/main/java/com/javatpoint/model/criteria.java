package com.javatpoint.model;

public enum criteria {

	arabic,english,email,sms,confirmation,booking,forgetpassword;
  Method x;
  Type y;
  Language z;
  
	
	/*
	@Override
	public int toString() {


switch(this){

case confirmation:  return "confirmation";
case booking: return "booking";
case forgetpassword: return "forgetpassword";

default: return notfound;		
		
		
	}
	
	
	
	
*/	

	public Method get(Method x) {
		return x;
		
		
	}
	
	
	public Type get(Type x) {
		return x;
		
		
	}
	
	
	
	
}