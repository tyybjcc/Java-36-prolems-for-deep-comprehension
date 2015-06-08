package com.java36.chap4;

import java.util.Arrays;
import java.util.Formatter;

public class ValidChar {
	//单纯高代理范围和低代理范围的Unicode转义不是有效的char字符
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
