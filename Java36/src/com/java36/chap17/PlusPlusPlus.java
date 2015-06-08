package com.java36.chap17;

public class PlusPlusPlus {
	//通过对比发现：对于连续字符串+操作，编译器只使用一个StringBuilder而不是很多个，从而避免了资源浪费
	public static void main(String[] args) {
		final int TIMES = 100;
		long time1,time2;
		
		//continuous1
		time1 = System.nanoTime();
		for(int i=0;i<TIMES;i++) {
			continuous1();
		}
		time2 = System.nanoTime();
		System.out.println("continuous1 time elapsed: " + (time2-time1));
		
		//continuous1
		time1 = System.nanoTime();
		for(int i=0;i<TIMES;i++) {
			continuous2();
		}
		time2 = System.nanoTime();
		System.out.println("continuous2 time elapsed: " + (time2-time1));
		
		//stepByStep
		time1 = System.nanoTime();
		for(int i=0;i<TIMES;i++) {
			stepByStep();
		}
		time2 = System.nanoTime();
		System.out.println("stepByStep time elapsed: " + (time2-time1));

		//manuallyStringBuilder
		time1 = System.nanoTime();
		for(int i=0;i<TIMES;i++) {
			manuallyStringBuilder();
		}
		time2 = System.nanoTime();
		System.out.println("manuallyStringBuilder time elapsed: " + (time2-time1));
		
		//manuallyStringBuilderDull
		time1 = System.nanoTime();
		for(int i=0;i<TIMES;i++) {
			manuallyStringBuilderDull();
		}
		time2 = System.nanoTime();
		System.out.println("manuallyStringBuilderDull time elapsed: " + (time2-time1));
		
		
	}
	
	public static void continuous1() {
		String s = "a";
		String S = s+s+s+s+s+s+s+s+s+s; //10
	}
	
	public static void continuous2() {
		String s = "a";
		String S = (s+s)+(s+s)+(s+s)+(s+s)+(s+s); //10
	}
	
	public static void stepByStep() {
		String s = "a";
		String S = s+s;
		S = S+s;
		S = S+s;
		S = S+s;
		S = S+s;
		S = S+s;
		S = S+s;
		S = S+s;
		S = S+s;
	}
	
	public static void manuallyStringBuilder() {
		String s = "a";
		StringBuilder SBuilder = (new StringBuilder()).append(s).append(s).append(s).append(s).append(s).append(s).append(s).append(s).append(s).append(s);
		String S = SBuilder.toString();
	}
	
	public static void manuallyStringBuilderDull() {
		String s = "a";
		String S = (new StringBuilder()).append(s).append(s).toString();
		S = (new StringBuilder()).append(S).append(s).toString();
		S = (new StringBuilder()).append(S).append(s).toString();
		S = (new StringBuilder()).append(S).append(s).toString();
		S = (new StringBuilder()).append(S).append(s).toString();
		S = (new StringBuilder()).append(S).append(s).toString();
		S = (new StringBuilder()).append(S).append(s).toString();
		S = (new StringBuilder()).append(S).append(s).toString();
		S = (new StringBuilder()).append(S).append(s).toString();
		
	}

}
