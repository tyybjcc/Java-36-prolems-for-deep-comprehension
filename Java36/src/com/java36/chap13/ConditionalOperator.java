package com.java36.chap13;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		//条件运算符的优先级比"="高，它的整个结果是一个值
		int i=1,j=2,k;
		k= i>j?++i:++j;
		
		System.out.println("i,j,k -> "+i+","+j+","+k);
	}

}
