package com.java36.chap21;

public class StringEqualsHashCode {
	
	public static void main(String[] args) {
		
		System.out.println("String without being interned:");
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1==str2 : "+(  str1==str2  ));	//address compare. Result: false
		System.out.println("str1.equals(str2) : "+(  str1.equals(str2)  ));	//value compare
		//java single dispatch. Even you convert the type to Object. str.equals(Object obj) will also be used;
		System.out.println("((Object)str1).equals((Object)str2) : "+(  ((Object)str1).equals((Object)str2)  ));	
		
		//String hashCode
		System.out.println("\nString hashCode:");
		System.out.println("str1 hashCode" + str1.hashCode());	//value hashCode instead of address hashCode
		System.out.println("str2 hashCode" + str2.hashCode());
	}

}
