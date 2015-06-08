package com.java36.chap24;

//���ڷ��ͻ��Ķ���������������β� ���� �������͵Ĳ����������ж�ʱ���������Ͳ���Ϊ�������͵Ļ��� �����жϡ�
public class OverloadTest {
	
	//������ΪException��
	public <T extends Exception> void print(T t) {
		System.out.println(t);
	}
	
	//������ΪObject��
	public <T> void print(T t) {
		System.out.println(t);
	}
	
	public void print(OverloadTest o) {
		System.out.println(o);
	}
	
	
	/*
	// Method print(String) has the same erasure print(String) as another method in type OverloadTest
	public String void print(String str) {
		System.out.println(str);
	}
	 */
}
