package com.java36.chap4;

public class ValidIdentifier2 {
	//判断Unicode高代理范围和低代理范围是不是有效的java标识符
	//结合ValidChar类，可以看出单纯高代理范围和低代理范围的Unicode转义不是有效的char字符。如果是，会和增补字符造成混淆。
	public static void main(String[] args) {
		int highSurrogateMin = 0xd800;
		int highSurrogateMax = 0xdbff;
		int lowSurrogateMin = 0xdc00;
		int lowSurrogateMax = 0xdfff;
		
		int highValidCount=0;
		int lowValidCount=0;
		
		for(int i=highSurrogateMin; i<=highSurrogateMax; i++) {
			if(Character.isJavaIdentifierPart(i)) {
				highValidCount++;
			}
		}
		
		for(int i=lowSurrogateMin; i<=lowSurrogateMax; i++) {
			if(Character.isJavaIdentifierPart(i)) {
				lowValidCount++;
			}
		}
		
		System.out.println("highValidCount: " + highValidCount);	//result: 0
		System.out.println("lowValidCount: " + lowValidCount);	//result: 0
		
	}

}
