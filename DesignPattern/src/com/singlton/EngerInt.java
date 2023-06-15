package com.singlton;

public class EngerInt {
	//Object is create once at the time of class load
	private static EngerInt engerInt= new EngerInt();
	
	public static EngerInt getEngerInt(){
		return engerInt;
	}
	
	

}
