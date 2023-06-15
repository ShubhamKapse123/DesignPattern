package com.singlton;

public class Singleton {

	public static void main(String[] args) {
		System.out.println("--------Lazy Int------------");

		LazyInt sbi = LazyInt.getLazyInt();

		LazyInt hdfc = LazyInt.getLazyInt();

		System.out.println(sbi.hashCode());

		System.out.println(hdfc.hashCode());

		System.out.print(sbi.equals(hdfc));

		System.out.println("--------Enger Int------------");

		EngerInt sbiEI = EngerInt.getEngerInt();

		EngerInt hdfcEI = EngerInt.getEngerInt();

		System.out.println(sbiEI.hashCode());

		System.out.println(hdfcEI.hashCode());

		System.out.print(sbiEI.equals(hdfcEI));

		System.out.println("--------Thread Safe Int------------");

		ThreadSafeSinglton sbiTS = ThreadSafeSinglton.getThreadSafeSinglton();

		ThreadSafeSinglton hdfcTS = ThreadSafeSinglton.getThreadSafeSinglton();

		System.out.println(sbiTS.hashCode());

		System.out.println(hdfcTS.hashCode());

		System.out.print(sbiTS.equals(hdfcTS));
	}
}
