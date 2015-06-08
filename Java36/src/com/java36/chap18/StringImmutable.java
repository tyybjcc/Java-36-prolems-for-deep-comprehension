package com.java36.chap18;

public class StringImmutable{
	
	public static void main(String[] args) {
		String s1="abc";
		String sUpper = s1.toUpperCase();
		String sConcat = s1.concat("def");
		String sSub = s1.substring(2);	//起始
		String sSub2 = s1.substring(1, 2);	//起始，超尾
		
		System.out.println(s1);
		System.out.println(sUpper);
		System.out.println(sConcat);
		System.out.println(sSub);
		System.out.println(sSub2);
		
	}

}
