package com.java36.chap33;


public class InnerTestClient2 {
	
	public static void main(String...args) {
		InnerTest itest = new InnerTest();
		//�ڲ�������ÿ���ͨ���ⲿ���ȡ
		//�ڲ���Ķ���ͨ���ⲿ������޶�ִ��new���� ������
		InnerTest.Class2 c2 = itest.new Class2();
	}

}
