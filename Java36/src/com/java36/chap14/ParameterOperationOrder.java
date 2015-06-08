package com.java36.chap14;

public class ParameterOperationOrder {
	
	//没什么特殊的
	public static void main(String[] args) {
		int i = 1;
		function1(i++,++i,i=5);
	}
	
	public static void function1(int i, int j, int k) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
