package com.java36.chap28;

import java.util.Arrays;

public class Initialization {
	int intval = -1;
	String str1,str2,str3,str4;
	
	{
		str1 = upperFirst("hello");
		str2 = "world.";
	}
	
	public Initialization(String adjective) {
		str3 = upperFirst("java");
		str4 = upperFirst(adjective);
		System.out.println(join(" ",str1,str2,str3,str4));
	}
	
	/**
	 * return first letter capitalized String
	 * @param str
	 * @return
	 */
	public String upperFirst(String str) {
		if(str==null || str.length()==0)	return str;
		return String.valueOf(Character.toUpperCase(str.charAt(0))).concat( str.substring(1) );
	}
	
	/**
	 * join a list of String(or Object) divided by division
	 * @param division
	 * @param objs
	 * @return
	 */
	public static String join(String division, Object...objs) {
		if(objs.length==0)
			return null;
		
		StringBuilder builder = new StringBuilder(String.valueOf(objs[0]));
		for(Object obj: Arrays.copyOfRange(objs, 1, objs.length)) {
			builder.append(division).append(obj);
		}
		return builder.toString();
	}
	
	
	public static void main(String...args) {
		Initialization init = new Initialization("cool");
	}
	
	

}
