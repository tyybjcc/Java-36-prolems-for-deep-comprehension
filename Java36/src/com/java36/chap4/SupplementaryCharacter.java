package com.java36.chap4;

import java.util.Arrays;

public class SupplementaryCharacter {
	
	public static void main(String[]args) {
		//大于0xffff，是增补字符（而非BMP）
		int codePoint = 0x28e16;
		
		//获取增补字符对应的char[]
		char[] c2 = Character.toChars(codePoint);	//
		//因为其中每个字符分别属于高低代理范围，因此均不是有效的字符
		System.out.println("print array: " + Arrays.toString(c2));
		
		//打印对应的增补字符（由于电脑没有安装，因此此处不能识别）
		String s = String.valueOf(c2);	//
		System.out.println("print: " + s);
		
		//增补字符长度计算（String类是通过char数组长度计算的）
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
