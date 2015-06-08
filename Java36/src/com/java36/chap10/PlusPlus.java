package com.java36.chap10;

public class PlusPlus {
	
	//the difference of i++ and ++i
	public static void main(String[] args) {
		int i = 0;
		pre(i);
		post(i);
		
	}
	
	public static void pre(int i) {
		i=++i;
		System.out.println(i);
	}
	public static void post(int i) {
		i=i++;
		System.out.println(i);
	}
	

}
