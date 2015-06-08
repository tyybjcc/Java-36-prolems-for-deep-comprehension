package com.java36.chap30;

public class BoxOrUnbox {
	
	public static void main(String[] args) {
		//装箱操作
		Integer iObj1 = 1;
		Integer iObj2 = 2;
		
		//先拆箱计算，再将结果装箱
		Integer iResult = iObj1 + iObj2;
		
		
		//测试2：对于==运算符执行装箱or拆箱
		Integer iObj = new Integer(1);
		int i = 1;
		System.out.println(iObj==i);
		//结果为true，说明执行了拆箱比较
	}

}
