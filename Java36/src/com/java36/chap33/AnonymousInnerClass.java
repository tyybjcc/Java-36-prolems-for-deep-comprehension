package com.java36.chap33;

public class AnonymousInnerClass {
	interface Inter1 {
		void m1();
		void m2();
	}
	
	static class Class1 {
		void m3() {
			System.out.println("class1 m3");
		}
		void m4() {
			System.out.println("class1 m4");
		}
	}
	
	public static void main(String...args) {
		getInter1Imple().m1();
		
		getClass1().m3();
	}
	
	public static Inter1 getInter1Imple() {
		return new Inter1(){
			@Override
			public void m1() {
				System.out.println("m1");
			}

			@Override
			public void m2() {
				System.out.println("m2");
			}
		};
	}
	
	public static Class1 getClass1() {
		return new Class1() {
			@Override
			void m3() {
				System.out.println("anonymous m3");
			}
		};
	}

}
