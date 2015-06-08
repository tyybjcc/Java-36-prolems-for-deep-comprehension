package com.java36.chap26;

public class ShadowingOverriding {
	
	static class Super {
		//不能为private，如果修饰符是private，虽然可以访问，但不能继承
		void function1() {
			System.out.println("super function1");
		}
		
		static void staticFunction1() {
			System.out.println("super static function1");
		}
		
		int var1 = 1;
		public String str1 = "super str1";
		protected static String str2 = "super str2";
		
	}
	
	static class Sub extends Super {
		@Override
		void function1() {
			System.out.println("sub function1");
		}
		
		//shadowing
		static void staticFunction1() {
			System.out.println("sub static function1");
		}
		
		//shadowing
		private int var1 = 2;
		protected static String str1 = "sub str1";
		public String str2 = "sub str2";
	}
	
	//test
	public static void main(String[] args) {
		Super s0 = new Super();
		Super s1 = new Sub();
		
		//dynamic bounding
		s0.function1();
		s1.function1();
		
		//static bounding
		Sub s2 = new Sub();
		System.out.println("var1:");
		System.out.println(s1.var1);
		System.out.println(s2.var1);
		System.out.println("str1:");
		System.out.println(s1.str1);
		System.out.println(s2.str1);
		System.out.println("str2:");
		System.out.println(s1.str2);
		System.out.println(s2.str2);
		
	}

}
