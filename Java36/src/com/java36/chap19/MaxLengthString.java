
package com.java36.chap19;

import java.util.Arrays;

public class MaxLengthString {
	
	public static void main(String[] args) {
		
		testMaxLength();
	}
	
	public static int testMaxLength() {
		int high = Integer.MAX_VALUE;
		int low = 1000;
		
		int mid;
		
		while(true) {
			mid = (high+low)>>>1;	//即使相加超过Integer.MAX_VALUE，结果也正确
			if(canAllocate(mid)) {
				low = mid;
			}else {
				high = mid;
			}
			System.out.println("range: "+low/1024/1024+"M ~ "+high/1024/1024+"M");
			if( (float)(high-low)/low < 0.001 ) break;	//误差小于0.1%则停止计算
		}
		
		return (high+low)/2;
	}
	
	public static boolean canAllocate(int length) {
		try{
			//此处注意，一个char是两个字节
			System.out.println(length);
			char[] c = new char[length];
			return true;
		} catch(OutOfMemoryError e) {
			return false;
		}
	}

}
