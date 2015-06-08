package com.java36.chap32;

public class AnonymousClass {
	static interface MyInterface {
		void say();
	}
	public static void main(String...args) {
		MyInterface inter = new MyInterface() {
			@Override
			public void say() {
				System.out.println("anonymous class say...");
			}
		};
		inter.say();
	}

}
