package com.java36.chap7;

public class Ulp {
	//�����ͼ�϶����һ��ֵ��������floatΪ��
	
	public static void main(String[] args) {
		float i = 0.1f;
		
		System.out.println(Math.ulp(i));
		System.out.println(Math.nextUp(i));
		
		System.out.println(Math.nextAfter(i, Float.POSITIVE_INFINITY));
		System.out.println(Math.nextAfter(i, Float.NEGATIVE_INFINITY));
	}
	

}
