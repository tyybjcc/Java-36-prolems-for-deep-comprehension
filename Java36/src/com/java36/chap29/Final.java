package com.java36.chap29;

public class Final {
	{
		//如果z出现在=右边，则造成错误，此时必须使用this.z
		print();
		z = 5;
	}
	final int x = 5;
	final int y = (int)Math.random();
	final int z;
	int w = 5;
	
	static {
		printStatic();
		zStatic = 5;
	}
	final static int xStatic = 5;
	final static int yStatic = (int)Math.random();
	final static int zStatic;
	static int wStatic = 5;
	
	
	public void print() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
	}
	
	public static void printStatic() {
		System.out.println(xStatic);
		System.out.println(yStatic);
		System.out.println(zStatic);
		System.out.println(wStatic);
	}
	
	public static void main(String...args) {
		System.out.println("------------");
		Final f = new Final();
	}

}
