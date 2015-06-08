package com.java36.chap22;

public class StringIntern {
	
	public static void main(String[] args) {
		//intern test
		System.out.println("\nString with intern():");
		String str1 = "str";
		String str2 = "str";
		System.out.println(str1==str2);	//both interned
		str1 = new String("str");
		System.out.println(str1==str2);	//str1 not interned and str2 interned
		str1 = str1.intern();	//不能仅仅使用str1.intern(), 必须将返回的指针赋给str1
		System.out.println(str1==str2); //both interned
	}

}
