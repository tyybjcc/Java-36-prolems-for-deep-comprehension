package com.java_test;

public class UTF8Test {
	
	public static void main(String[] args) {
		for(int i=0x0000; i<0x0100; i++) {
			System.out.print(i+": ");
			System.out.println( Character.isJavaIdentifierPart(i) );
		}
	}

}
