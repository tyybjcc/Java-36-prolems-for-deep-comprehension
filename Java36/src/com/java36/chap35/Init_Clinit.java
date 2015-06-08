package com.java36.chap35;

public class Init_Clinit {
	{
		try {
			throw new Exception("实例初始化块");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private int intX = getX();
	private static int staticX = getStaticX();
	public Init_Clinit() {
		try {
			throw new Exception("构造器");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private int getX() {
		try {
			throw new Exception("实例声明初始化");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 1;
	}
	
	private static int getStaticX() {
		try {
			throw new Exception("静态声明初始化");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 2;
	}
	
	
	
	static {
		try {
			throw new Exception("静态初始化块");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		Init_Clinit init = new Init_Clinit();
	}

}
