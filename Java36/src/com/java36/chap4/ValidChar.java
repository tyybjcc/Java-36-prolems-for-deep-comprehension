package com.java36.chap4;

import java.util.Arrays;
import java.util.Formatter;

public class ValidChar {
	//�����ߴ���Χ�͵ʹ���Χ��Unicodeת�岻����Ч��char�ַ�
	public static void main(String[]args) {
		int highSurrogateMin = 0xd800;
		int highSurrogateMax = 0xdbff;
		int lowSurrogateMin = 0xdc00;
		int lowSurrogateMax = 0xdfff;
		
		int highSurrogateValidCount = 0;
		int lowSurrogateValidCount = 0;
		
		Formatter fmt = new Formatter();
		int breakLineCount=0;
		for(int codePoint=highSurrogateMin; codePoint<=highSurrogateMax; codePoint++) {
			System.out.print(Character.toChars(codePoint)[0]+" ");
			if(++breakLineCount == 64) {
				breakLineCount=0;
				System.out.println();
			}
		}
		
		for(int codePoint=highSurrogateMin; codePoint<=highSurrogateMax; codePoint++) {
			System.out.print(Character.toChars(codePoint)[0]+" ");
			if(++breakLineCount == 64) {
				breakLineCount=0;
				System.out.println();
			}
		}
		
	}

}
