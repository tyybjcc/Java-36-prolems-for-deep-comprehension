package com.java36.chap33;


public class InnerTestClient2 {
	
	public static void main(String...args) {
		InnerTest itest = new InnerTest();
		//内部类的引用可以通过外部类获取
		//内部类的对象通过外部类对象限定执行new操作 来创建
		InnerTest.Class2 c2 = itest.new Class2();
	}

}
