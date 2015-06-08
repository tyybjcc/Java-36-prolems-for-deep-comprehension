package com.java36.chap35.class_init;

public class ClassInit7 {
	static {
		System.out.println("ClassInit7初始化...");
	}
	
	static class ClassInit8 {
		static {
			System.out.println("ClassInit8初始化……");
		}
	}

}
