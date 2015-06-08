package com.java36.chap17;

public class StringPlus {
	//ע�⣺���ڱ���ʱ�����ַ�����+����������������ǰ����ã�������������ʱ����StringBuilder
	public static void main(String[] args) {
		testPlus();
		
		oracleImplementation();
		
		eclipseImplementation();
	}
	
	public static void testPlus() {
		System.out.println("s1"+"s2");
	}
	
	public static void oracleImplementation() {
		System.out.println( (new StringBuilder()).append("s1").append("s2") );
	}
	
	public static void eclipseImplementation() {
		//for basic types and String
		System.out.println( new StringBuilder(String.valueOf("s1")).append("s2") );
		//�����������ͣ��������ͣ�
		//System.out.println( new StringBuilder().append(new Integer(1)).append("s") );
	}

}
