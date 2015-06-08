package com.java36.chap7;

public class PrintFloat {
	
	public static void main(String[] args) {
		float f = 0.1f;
		int bitsInfo = Float.floatToIntBits(f);
		System.out.println( Integer.toBinaryString(bitsInfo) );
		//对于double，采用Long.toBinaryString
		
	}

}
