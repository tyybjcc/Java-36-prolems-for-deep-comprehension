package com.java36.chap4;

import java.util.Arrays;

public class SupplementaryCharacter {
	
	public static void main(String[]args) {
		//����0xffff���������ַ�������BMP��
		int codePoint = 0x28e16;
		
		//��ȡ�����ַ���Ӧ��char[]
		char[] c2 = Character.toChars(codePoint);	//
		//��Ϊ����ÿ���ַ��ֱ����ڸߵʹ���Χ����˾�������Ч���ַ�
		System.out.println("print array: " + Arrays.toString(c2));
		
		//��ӡ��Ӧ�������ַ������ڵ���û�а�װ����˴˴�����ʶ��
		String s = String.valueOf(c2);	//
		System.out.println("print: " + s);
		
		//�����ַ����ȼ��㣨String����ͨ��char���鳤�ȼ���ģ�
		System.out.println("string length: " + s.length());		//
		System.out.println("codePoint Count: " + s.codePointCount(0, s.length()) );		//
		
		//from codePoint to surrogate
		String high = Integer.toHexString( (int)Character.highSurrogate(codePoint) );
		String low = Integer.toHexString( (int)Character.lowSurrogate(codePoint) );
		System.out.println("high surrogate: \\u"+high+", low surrogate: \\u"+low);
		//method 2
		high = Integer.toHexString((int)c2[0]);		//Integer.toHexString(int)
		low = Integer.toHexString((int)c2[1]);
		System.out.println("high surrogate: \\u"+high+", low surrogate: \\u"+low);
		
		//from surrogate to codePoint
		codePoint = Character.toCodePoint(Character.highSurrogate(codePoint), Character.lowSurrogate(codePoint));	//codePoint not change
		System.out.println("codePoint: 0x" + Integer.toHexString(codePoint));
		
		
		
		
	}

}
