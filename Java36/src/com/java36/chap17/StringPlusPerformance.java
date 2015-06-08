package com.java36.chap17;

public class StringPlusPerformance {
	//Ñ­»·´ÎÊý
	static final int TIMES = 1000000;
	
	public static void main(String[]args) {
		System.out.println("Time cost using '+':     "+plusPerformance());
		System.out.println("Time cost using 'append':"+appendPerformance());
		
	}
	
	public static long plusPerformance() {
		long start=System.nanoTime(),end;
		String str="";
		for(int i=0;i<TIMES;i++) {
			str+="s";
		}
		end = System.nanoTime();
		return end-start;
	}
	
	public static long appendPerformance() {
		long start=System.nanoTime(),end;
		StringBuilder strBld = new StringBuilder();
		for(int i=0;i<TIMES;i++) {
			strBld.append("s");
		}
		end = System.nanoTime();
		return end-start;
	}

}
