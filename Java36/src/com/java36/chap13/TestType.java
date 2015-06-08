package com.java36.chap13;

public class TestType {
	//just for test:根据反汇编代码得出编译器会对结果进行包装类型转换
	public static void main(String[] args) {
		int i = 0,j=0;
		byte b=1;
		Short sBox = new Short((short) 2);
		sBox = i>j?b:sBox;
	}

}
