package com.java36.chap36;

public class ClassHidden extends SuperClassHidden{
	public class ClassHidden2 {	}
	
	public static void main(String[] args) {
		//由内而外:同一代码块的类覆盖外层同名类
		System.out.println(ClassHidden.class);
		//由此及彼：本类中定义的类覆盖父类中的同名类
		System.out.println(ClassHidden2.class);
	}
}
