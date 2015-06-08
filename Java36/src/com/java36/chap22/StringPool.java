package com.java36.chap22;

public class StringPool {
	final static int TIMES = 100000;
	
	public static void main(String[] args) {
		System.out.println("usePool: " + usePool());
		System.out.println("notUsePool: " + notUsePool());
		System.out.println("intern1: " + intern1());
		System.out.println("intern2: " + intern2());
	}
	
	public static long usePool() {
		long start = System.nanoTime();
		for(int i=0;i<TIMES;i++) {
			String s = "abcdabcdabcdabcdabcd";
		}
		return System.nanoTime()-start;
	}
	
	public static long notUsePool() {
		long start = System.nanoTime();
		for(int i=0;i<TIMES;i++) {
			String s = new String("abcdabcdabcdabcdabcd");
		}
		return System.nanoTime()-start;
	}
	
	public static long intern1() {
		long start = System.nanoTime();
		for(int i=0;i<TIMES;i++) {
			String s = "abcdabcdabcdabcdabcd".intern();
		}
		return System.nanoTime()-start;
	}
	
	public static long intern2() {
		long start = System.nanoTime();
		for(int i=0;i<TIMES;i++) {
			String s = (new String("abcdabcdabcdabcdabcd")).intern();
		}
		return System.nanoTime()-start;
	}

}
