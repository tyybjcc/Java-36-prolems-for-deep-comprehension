package com.java36.chap24;

public class ChooseOrder {
	/*void show(int data) {
		System.out.println("int");
	}*/
	
	/*void show(long data) {
		System.out.println("long");
	}*/
	
	/*void show(Integer data) {
		System.out.println("Integer");
	}*/
	
	/*void show(int... data) {
		System.out.println("int...");
	}*/
	
	void show(long...data) {
		System.out.println("long...");
	}
	
	
	//Long不能匹配,因为不是直接的装箱类型
	void show(Long data) {
		System.out.println("Long");
	}

	
	public static void main(String[]args) {
		//匹配顺序为: int long Integer int... long...
		new ChooseOrder().show(1);
		
	}

}
