package com.java36.chap13;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		//��������������ȼ���"="�ߣ��������������һ��ֵ
		int i=1,j=2,k;
		k= i>j?++i:++j;
		
		System.out.println("i,j,k -> "+i+","+j+","+k);
	}

}
