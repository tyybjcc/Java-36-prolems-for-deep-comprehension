package com.java36.chap24;

//可以删除某些重载方法观察结果的变化
//结论：编译器总是选择调用 需要转换较少的重载方法 ( 规则：extra -> int -> long -> float -> double, byte -> short)
public class OverloadChooseBasic {
	
	void show(byte data) {
		System.out.println("byte");
	}
	void show(short data) {
		System.out.println("short");
	}
	void show(char data) {
		System.out.println("char");
	}
	void show(int data) {
		System.out.println("int");
	}
	void show(long data) {
		System.out.println("long");
	}
	void show(float data) {
		System.out.println("float");
	}
	void show(double data) {
		System.out.println("double");
	}
	
	
	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		char c = 1;
		int i = 1;
		long l = 1;
		float f = 1;
		double d = 1;
		
		
		OverloadChooseBasic showObj = new OverloadChooseBasic();
		showObj.show(b);
		showObj.show(s);
		showObj.show(c);
		showObj.show(i);
		showObj.show(l);
		showObj.show(f);
		showObj.show(d);
		
		
	}

}
