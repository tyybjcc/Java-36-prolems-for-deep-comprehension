package com.java36.chap29;

// ��̬��ԱҲ���Ա��̳�
public class Extends {
	
	static class Father {
		static int intval = 3;
	}
	
	static class Son extends Father{
		
	}
	
	public static void main(String...args) {
		Son s = new Son();
		System.out.println(Son.intval);
	}

}
