package com.singlton;

import java.io.*;

public class Singleton {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		System.out.println("--------Lazy Int------------");
//
//		LazyInt sbi = LazyInt.getLazyInt();
//
//		LazyInt hdfc = LazyInt.getLazyInt();
//
//		System.out.println(sbi.hashCode());
//
//		System.out.println(hdfc.hashCode());
//
//		System.out.print(sbi.equals(hdfc));
//
//		System.out.println("--------Enger Int------------");
//
//		EngerInt sbiEI = EngerInt.getEngerInt();
//
//		EngerInt hdfcEI = EngerInt.getEngerInt();
//
//		System.out.println(sbiEI.hashCode());
//
//		System.out.println(hdfcEI.hashCode());
//
//		System.out.print(sbiEI.equals(hdfcEI));
//
//		System.out.println("--------Thread Safe Int------------");
//
//		ThreadSafeSinglton sbiTS = ThreadSafeSinglton.getThreadSafeSinglton();
//
//		ThreadSafeSinglton hdfcTS = ThreadSafeSinglton.getThreadSafeSinglton();
//
//		System.out.println(sbiTS.hashCode());
//
//		System.out.println(hdfcTS.hashCode());
//
//		System.out.print(sbiTS.equals(hdfcTS));

		System.out.println("--------Serialization-----------");

		ThreadSafeSinglton serialation = ThreadSafeSinglton.getThreadSafeSinglton();
		ObjectOutputStream oos= new ObjectOutputStream( new FileOutputStream(new File("/home/shubham/IdeaProjects/DesignPattern/DesignPattern/src/com/singlton/dataUtil.ser")));
		oos.writeObject(serialation);
		ThreadSafeSinglton deSerialation = null;
		ObjectInputStream ois= new ObjectInputStream( new FileInputStream(new File("/home/shubham/IdeaProjects/DesignPattern/DesignPattern/src/com/singlton/dataUtil.ser")));

		deSerialation = (ThreadSafeSinglton) ois.readObject();

		oos.close();
		ois.close();

		System.out.print(serialation==deSerialation);
	}
}
