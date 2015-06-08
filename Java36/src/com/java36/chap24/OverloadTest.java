package com.java36.chap24;

//对于泛型化的多个方法（即方法形参 存在 泛化类型的参数），则判断时将泛化类型擦除为泛化类型的基类 进行判断。
public class OverloadTest {
	
	//擦出后为Exception类
	public <T extends Exception> void print(T t) {
		System.out.println(t);
	}
	
	//擦出后为Object类
	public <T> void print(T t) {
		System.out.println(t);
	}
	
	public void print(OverloadTest o) {
		System.out.println(o);
	}
	
	
	/*
	// Method print(String) has the same erasure print(String) as another method in type OverloadTest
	public String void print(String str) {
		System.out.println(str);
	}
	 */
}
