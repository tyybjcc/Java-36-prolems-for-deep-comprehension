package com.java36.chap28;

public class DefaultValue {
	byte b;
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	
	String str;
	String[] strs;
	
	//��̬��Ա����
	
	public static void main(String...args) {
		DefaultValue dv = new DefaultValue();
		System.out.println(dv.b);
		System.out.println(dv.c);
		System.out.println(dv.s);
		System.out.println(dv.i);
		System.out.println(dv.l);
		System.out.println(dv.f);
		System.out.println(dv.d);
		System.out.println(dv.bool);
		                   
		System.out.println(dv.str);
		System.out.println(dv.strs);
		
		//�ֲ�����û��Ĭ��ֵ�������û�г�ʼ���������ʹ�ã�����ʱ�ᵼ���쳣��
		int i;
		/*
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The local variable i may not have been initialized
		System.out.println(i);
		*/
		//�������飬���ʹ��new���������������������е�Ԫ�ؾ��������ʼĬ��ֵ
		Object[] objs = new Object[100];
		System.out.println(objs[10]);	//null
	}

}
