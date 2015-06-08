package com.java36.chap35.indirect_reference;

public class Client {
	//成员变量的间接引用不会初始化引用类，而初始化成员变量所属类
	public static void main(String[]args) {
		System.out.println(Sub.val);
	}

}
