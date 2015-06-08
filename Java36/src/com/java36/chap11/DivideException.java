package com.java36.chap11;

public class DivideException {
	
	public static void main(String[] args) {
		
		// ArithmeticException
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		// ArithmeticException
		try {
			System.out.println(1%0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// +/-Infinity
		try {
			System.out.println(1.0/0);
			System.out.println(1/.0);
			
			System.out.println(1.0/-0);	//������Ϊ-0��������0����ת��Ϊ������ʱΪ0.0d
			System.out.println(1/-0.0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// NaN
		try {
			System.out.println(.0/0);
			System.out.println(0/.0);
			
			System.out.println(.0/-0);	//������Ϊ-0��������0����ת��Ϊ������ʱΪ0.0d
			System.out.println(0/-0.0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// NaN
		try {
			System.out.println(1.0%0);
			System.out.println(1%.0);
			
			System.out.println(1.0%-0.0);	//������Ϊ-0��������0����ת��Ϊ������ʱΪ0.0d
			System.out.println(1%-0.0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// ������-0��0����ͬ��
		System.out.println("int -0 is 0: ");
		System.out.println((double)-0);
		System.out.println();
		
		//��������+0.0��-0.0ֵ��Ȼ��ȣ������ֲ�ͬ
		if(-.0==.0) {
			System.out.println("-0d == +0d");
		}else {
			System.out.println("-0d != +0d");
		}
		
		
		
		
	}

}
