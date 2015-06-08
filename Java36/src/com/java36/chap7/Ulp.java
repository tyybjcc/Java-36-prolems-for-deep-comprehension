package com.java36.chap7;

public class Ulp {
	//浮点型间隙和下一个值，这里以float为例
	
	public static void main(String[] args) {
		float i = 0.1f;
		
		System.out.println(Math.ulp(i));
		System.out.println(Math.nextUp(i));
		
		System.out.println(Math.nextAfter(i, Float.POSITIVE_INFINITY));
		System.out.println(Math.nextAfter(i, Float.NEGATIVE_INFINITY));
	}
	

}
