package com.myclass;

public class ThreadSafeSinglton {
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
}
