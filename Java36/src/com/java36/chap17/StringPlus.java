package com.java36.chap17;

public class StringPlus {
	//注意：对于编译时常量字符串的+操作，编译器会提前计算好，而不是在运行时创建StringBuilder
	public static void main(String[] args) {
		testPlus();
		
		oracleImplementation();
		
		eclipseImplementation();
	}
	
	public static void testPlus() {
		System.out.println("s1"+"s2");
	}
	
	public static void oracleImplementation() {
		System.out.println( (new StringBuilder()).append("s1").append("s2") );
	}
	
	public static void eclipseImplementation() {
		//for basic types and String
		System.out.println( new StringBuilder(String.valueOf("s1")).append("s2") );
		//对于其他类型（对象类型）
		//System.out.println( new StringBuilder().append(new Integer(1)).append("s") );
	}

}
