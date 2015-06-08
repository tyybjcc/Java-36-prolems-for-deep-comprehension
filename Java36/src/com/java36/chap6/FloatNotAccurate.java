package com.java36.chap6;

import java.math.BigDecimal;

public class FloatNotAccurate {
	public static void main(String[] args) {
		//float后缀为f，double后缀为d。默认为double类型
		double sum_double = 0.1d + 0.2d;
		System.out.println(sum_double);
		
		
		//计算机中0.1到0.9的实际值
		System.out.println("\nReal value from 0.1 to 0.9 in computer:");
		for(int i=1; i<10; i++) {
			BigDecimal bd = new BigDecimal( Double.parseDouble("."+i) );	//BigDecimal
			System.out.println(bd);
		}
		
	}

}
