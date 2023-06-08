package com.myclass;

import java.io.Serializable;

public class ThreadSafeSinglton implements Serializable {
private static ThreadSafeSinglton threadSafeSinglton;
	
	private ThreadSafeSinglton() {
		
	}
	
	//Lazy Initialization 
	public static ThreadSafeSinglton getThreadSafeSinglton() {

		if(threadSafeSinglton==null) {
			synchronized (ThreadSafeSinglton.class) {
				threadSafeSinglton=new ThreadSafeSinglton();
			}
	
		}
		
		return threadSafeSinglton;
	}

	
	public Object readResolve(){
		return threadSafeSinglton;
	}
	
// @Override
// protected Object clone() throws CloneNotSupportedException {
// 	return super.clone();
// }

}
