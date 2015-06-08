package com.java36.chap29.method_forward_references.v2;

public class MethodForwardReferences {
	
	static class Father{
		
		{
			m1();
		}
		Father() {
			m1();
		}
		void m1() {
			System.out.println("father method 1");
		}
	}
	
	static class Son extends Father {
		String str="abc";
		Son() {
			super();
			m1();
		}
		@Override
		void m1() {
			System.out.println("son method 1");
			//System.out.println(str.toUpperCase());	//will cause error
		}
	}
	
	public static void main(String...args) {
		//三次构造器中都调用的是Son的成员防范，这样逻辑上会造成混乱甚至错误
		Son s = new Son();
	}
	

}
