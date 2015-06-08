package com.java36.chap22;

public class StringConstant {
	
	public static void main(String[] args) {
		System.out.println( (4+"str1"+1.2) == ("4str11.2") );	//true
		
		final int i = 4;
		final double d = 1.2;
		final String str = "str1";
		System.out.println( (i+str+d) == ("4str11.2") );	//true
		
		int i2 = 4;
		System.out.println( (i2+str+d) == ("4str11.2") );	//false 由于出现了常量，左边字符串对象在运行时产生，存在于堆内存
		System.out.println( (i+str+d).intern() == ("4str11.2") );	//true 对左边字符串进行了扣留
		
		//编译时能提前计算的均提前完成计算，能“扣留”的字符串均被扣留
		System.out.println( (4*5+"str1") == ("20str1") );	//true
		System.out.println( (4+5.2+"str1") == ("9.2str1") );	//true
	}

}
