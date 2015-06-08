package com.java36.chap8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopTest {
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3};
		List<String> names = new ArrayList<String>();
		names.add("name1");
		names.add("name2");
		names.add("name3");
		
		//basic loop
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		for(int i=0;i<names.size();i++) {
			System.out.print(names.get(i)+" ");
		}
		System.out.println();
		
		//iterator: 对于实现了iterable接口的集合类
		Iterator<String> ite = names.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}
		System.out.println();
		
		//for :
		
		for(int num:nums) {
			System.out.print(num+" ");
		}
		System.out.println();
		for(String name:names) {
			System.out.print(name+" ");
		}
		System.out.println();
		
	}

}
