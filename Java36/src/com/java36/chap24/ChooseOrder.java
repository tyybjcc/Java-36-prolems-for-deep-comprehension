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
	
	
	//Long����ƥ��,��Ϊ����ֱ�ӵ�װ������
	void show(Long data) {
		System.out.println("Long");
	}

	
	public static void main(String[]args) {
		//ƥ��˳��Ϊ: int long Integer int... long...
		new ChooseOrder().show(1);
		
	}

}
