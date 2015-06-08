package com.java36.chap35.class_init;

public class ClassInit {
	static {
		System.out.println("ClassInit初始化……");
	}
	
	public static void main(String...args) {
		//调用main方法初始化
		
		//创建类实例对象初始化
		new ClassInit2();
		
		//调用类静态方法
		ClassInit3.staticMethod();
		
		//引用静态成员
		String field = ClassInit4.Field;
		
		//使用Class.forName方法加载类；(注意：ClassLoader.loadClass方法仅加载类但不初始化)
		try {
			Class.forName("com.java36.chap35.class_init.ClassInit5");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//子类初始化会造成父类初始化
		new ClassInit6Son();
		
		
		//不会导致类初始化的情况
		System.out.println();
		//静态成员类初始化不会导致外围类初始化
		new ClassInit7.ClassInit8();
		//仅使用类的引用不会造成初始化
		ClassInit9 obj = null;
		//使用ClassLoader的loadClass方法加载类，但不会初始化
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		try {
			cl.loadClass("com.java36.chap35.class_init.ClassInit5");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		//调用类的值为编译时常量的静态常量
		
		
	}

}
