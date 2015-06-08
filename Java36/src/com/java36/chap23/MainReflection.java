package com.java36.chap23;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

//java reflection -- method invocation
public class MainReflection {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		@SuppressWarnings("unchecked")
		Class<MainReflection> c = (Class<MainReflection>) Class.forName("com.java36.chap23.MainReflection");
		System.out.println(Arrays.toString( c.getDeclaredClasses() ));
		
		@SuppressWarnings("unchecked")
		Class<Main> subClass = (Class<Main>) c.getDeclaredClasses()[0];
		if(subClass==null) throw new ClassNotFoundException();
		
		//静态方法通过反射调用
		Method mStatic = subClass.getDeclaredMethod("main", args.getClass());
		mStatic.invoke(null, (Object)new String[0] );	//对于String...或String[]，传入形参为数组，此时要显式转化为Object对象
		
		//非静态方法通过反射调用
		Main main = new Main();
		Method mMember = subClass.getDeclaredMethod("main2");
		mMember.invoke(main);
		
	}
	
	public static class Main {
		public static void main(String...args) {	//String...是语法糖，将输入参数列表转化为String[]数组
			System.out.println("入口类静态main方法");
			
		}
		public void main2() {
			System.out.println("非入口类非静态main方法");
		}
	}

}
