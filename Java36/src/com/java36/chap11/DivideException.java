package com.java36.chap11;

public class DivideException {
	
	public static void main(String[] args) {
		
		// ArithmeticException
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		// ArithmeticException
		try {
			System.out.println(1%0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// +/-Infinity
		try {
			System.out.println(1.0/0);
			System.out.println(1/.0);
			
			System.out.println(1.0/-0);	//这是因为-0就是整型0，被转换为浮点型时为0.0d
			System.out.println(1/-0.0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// NaN
		try {
			System.out.println(.0/0);
			System.out.println(0/.0);
			
			System.out.println(.0/-0);	//这是因为-0就是整型0，被转换为浮点型时为0.0d
			System.out.println(0/-0.0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// NaN
		try {
			System.out.println(1.0%0);
			System.out.println(1%.0);
			
			System.out.println(1.0%-0.0);	//这是因为-0就是整型0，被转换为浮点型时为0.0d
			System.out.println(1%-0.0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// 整型中-0和0是相同的
		System.out.println("int -0 is 0: ");
		System.out.println((double)-0);
		System.out.println();
		
		//浮点型中+0.0和-0.0值虽然相等，但表现不同
		if(-.0==.0) {
			System.out.println("-0d == +0d");
		}else {
			System.out.println("-0d != +0d");
		}
		
		
		
		
	}

}
