package com.singlton;

public class LazyInt {
/*step 1: Make Constructor should be private
 * 
  step 2: make private static class type variable to store object reference 
  
  step 3: with the help of method we return the object for this 
  make one public static method for return object
  
*/	
	private static LazyInt bank;
	
	private LazyInt() {
		
	}
	
	//Lazy Initialization 
	public static LazyInt getLazyInt() {

		if(bank==null) {
			bank=new LazyInt();
		}
		
		return bank;
	}
}
