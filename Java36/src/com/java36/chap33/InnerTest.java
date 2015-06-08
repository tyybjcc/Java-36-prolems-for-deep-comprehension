package com.java36.chap33;

class InnerTest {
	private static String name = "myName";
	private String name2 = "myName2";
	private class Class1 {
		//不能有静态代码块（值为编译时常量的final静态成员是可以的）
		final static int Num = 5;
		//static int num2 = 3;
		/*
		static {
			
		}
		*/
		//enum Week{Weekend, Weekday};
		//interface InterInner{}
		/*
		static class InnerInnerStaticClass{
			
		}
		*/
		class InnerInnerClass{}
		
		//私有方法不能被继承，即使是在同一个类中（但可以访问）
		private void m1() {
		}
		
	}
	/*private */class Class2 extends Class1 {
		//@Override	//private methods cannot be inherited
		private void m1() {	//inner class can use outer and other class freely
			//other innser classes
			Class1 c = new Class1();
			c.m1();
			System.out.println(Class1.Num);
			//outer class
			InnerTest extTest = new InnerTest();
			System.out.println(name);
			System.out.println(name2);
			//other static member class
			StaticClass sc = new StaticClass();
			System.out.println(sc.name2);
			System.out.println(StaticClass.name);
		}
	}
	
	private static class StaticClass{
		static String name = "name1";
		String name2 = "name2";
		
		//Class1 c1 = new Class1();
		void say() {
			System.out.println(name);
		}
	}
	
	public static void staticMethod1() {
		
	}
	
	public static void main(String[]args) {
		InnerTest ext = new InnerTest();
		Class2 c2 = ext.new Class2();	//ext.new for inner Class
		c2.m1();
	}

}
