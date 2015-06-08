package com.java36.chap31;

import java.util.Arrays;

public class JaggedArray {
	
	public static void main(String...args) {
		int[][] b = new int[2][];
		b[0] = new int[4];
		b[1] = new int[5];
		
		for(int[] bitem:b){
			System.out.println(Arrays.toString(bitem));
		}
	}

}
