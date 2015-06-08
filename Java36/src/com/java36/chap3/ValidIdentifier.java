package com.java36.chap3;

public class ValidIdentifier {
	
	public static void main(String[] args) {
		int startCount = 0;
		int partCount = 0;
		
		for(int i=0x0000; i<0x10FFFF; i++) {
			if(Character.isJavaIdentifierPart(i)) {
				partCount ++;
				if(Character.isJavaIdentifierStart(i)) {
					startCount ++;
				}
			}
		}
		System.out.println("Unicode Count: " + (0x10FFFF+1) );	// 1024*1024*(16/17)
		System.out.println("Java Identifier Part Count: " + partCount);
		System.out.println("Java Identifier Start Count: " + startCount);
		System.out.println("partCount - startCount: " + (partCount-startCount));
	}

}
