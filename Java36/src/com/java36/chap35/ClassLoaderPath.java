package com.java36.chap35;

public class ClassLoaderPath {
	//三个类加载器路径
	//扩展类加载器路径可以通过jvm参数进行设置：java -Djava.class.path=.;C: -Djava.ext.dirs=C:;D:
	public static void main(String[]args) {
		//启动类加载器路径
		System.out.println(System.getProperty("sun.boot.class.path"));
		//扩展类加载器路径
		System.out.println(System.getProperty("java.ext.dirs"));
		//系统类加载器路径
		System.out.println(System.getProperty("java.class.path"));
	}

}
