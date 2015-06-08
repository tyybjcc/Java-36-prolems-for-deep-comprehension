package com.java36.chap29;

public class ForwardReference {
	//int x = y;	//leading to forward reference
	int x = this.y;	//cause no problem.
	int y;
	
	//ditto(м╛ио)
	//static int a=b;
	static {
		b = 3;
	}
	static int a = ForwardReference.b;
	static int b;
	static {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String...args) {
		
	}

}
