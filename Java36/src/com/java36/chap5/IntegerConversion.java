package com.java36.chap5;

public class IntegerConversion {
	
	public static void main(String[]args) {
		//����������ת�����в��ԣ��������������ת���������ֵû�з�����Ư�ơ�
		shortChar();
		byteChar();
		
		byteInt();
		//...������ת�����ơ�
		
		//����ȫ��ת��������ֵ�������������Ҳ���ܱ仯����Ϊ����תС��������λ�Ľ�ȡ������
		posToNeg();
		
		
	}
	
	public static void shortChar() {
		short s;
		char c;
		
		System.out.print("short->char->short: ");
		s = 1;
		System.out.print(s+" -> ");
		c = (char)s;
		System.out.print((int)c +" -> ");
		s = (short)c;
		System.out.println(s);
		
		System.out.print("short->char->short: ");
		s = -1;
		System.out.print(s+" -> ");
		c = (char)s;
		System.out.print((int)c +" -> ");
		s = (short)c;
		System.out.println(s);
	}
	
	public static void byteChar() {
		byte b;
		char c;
		
		System.out.print("byte->char->short: ");
		b = 1;
		System.out.print(b+" -> ");
		c = (char)b;
		System.out.print((int)c +" -> ");
		b = (byte)c;
		System.out.println(b);
		
		System.out.print("byte->char->short: ");
		b = -1;
		System.out.print(b+" -> ");
		c = (char)b;
		System.out.print((int)c +" -> ");
		b = (byte)c;
		System.out.println(b);
	}
	
	public static void byteInt() {
		byte b = -1;
		for(b=Byte.MIN_VALUE; b<=Byte.MAX_VALUE; b++) {
			if( b != (byte)((int)b) ){
				System.out.println("byte to int not problem occurs!");
			}
			if(b==Byte.MAX_VALUE) break;
		}
		
	}
	
	public static void posToNeg() {
		System.out.println("\nThe case from a positive to a negative:");
		//����ȫ��ת���������为�������
		char ch = 0x01ff;
		byte b = (byte)ch;
		System.out.println(b);
		
		short s = 0x01ff;
		b = (byte)s;
		System.out.println(b);
		
		int i = 0x01ff;
		b = (byte)s;
		System.out.println(b);
	}
	

}
