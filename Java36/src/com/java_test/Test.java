package com.java_test;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(-1>>31);
		System.out.println("name1".hashCode());
		System.out.println("name2".hashCode());
		System.out.println("name3".hashCode());
		try {
			Class.forName("sdf");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
