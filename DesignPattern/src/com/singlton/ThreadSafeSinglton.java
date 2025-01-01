package com.singlton;

import java.io.Serializable;

public class ThreadSafeSinglton implements Serializable,Cloneable{
    private static volatile  ThreadSafeSinglton threadSafeSinglton;

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
	// is should not clone the singleton pattern
	 @Override
	 protected Object clone() throws CloneNotSupportedException {
	  throw new CloneNotSupportedException();
	 }

}

