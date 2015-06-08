package com.java36.chap15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidSwap {
	private static class SwapWrapper {
		private int a;
		private int b;
		SwapWrapper(int _a, int _b) {
			this.a = _a;
			this.b = _b;
		}
		@Override
		public String toString() {
			return "nums: "+a+", "+b;
		}
	}
	
	public static void main(String[] args) {
		SwapWrapper nums = new SwapWrapper(1,2);
		System.out.println(nums);
		
		//
		swap1(nums);
		System.out.println(nums);
		
		//
		swap2(nums);
		System.out.println(nums);
		
		//
		swap3(nums);
		System.out.println(nums);
		
	}
	
	
	
	public static void swap1(final SwapWrapper nums) {
		int temp = nums.a;
		nums.a = nums.b;
		nums.b = temp;
	}
	
	public static void swap2(final SwapWrapper nums) {
		nums.a = nums.a + nums.b;
		nums.b = nums.a - nums.b;
		nums.a = nums.a - nums.b;
	}
	
	public static void swap3(final SwapWrapper nums) {
		nums.a = nums.a ^ nums.b;
		nums.b = nums.a ^ nums.b;
		nums.a = nums.a ^ nums.b;
	}
	

}
