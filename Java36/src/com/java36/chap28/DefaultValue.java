package com.java36.chap28;

public class DefaultValue {
	byte b;
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	
	String str;
	String[] strs;
	
	//静态成员类似
	
	public static void main(String...args) {
		DefaultValue dv = new DefaultValue();
		System.out.println(dv.b);
		System.out.println(dv.c);
		System.out.println(dv.s);
		System.out.println(dv.i);
		System.out.println(dv.l);
		System.out.println(dv.f);
		System.out.println(dv.d);
		System.out.println(dv.bool);
		                   
		System.out.println(dv.str);
		System.out.println(dv.strs);
		
		//局部变量没有默认值，如果在没有初始化的情况下使用，编译时会导致异常。
		int i;
		/*
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The local variable i may not have been initialized
		System.out.println(i);
		*/
		//对于数组，如果使用new创建数组对象，则数组对象中的元素均被赋予初始默认值
		Object[] objs = new Object[100];
		System.out.println(objs[10]);	//null
	}

}
