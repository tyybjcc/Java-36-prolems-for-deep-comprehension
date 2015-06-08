package com.java36.chap31;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;

public class ArrayMember {
	
	public static void main(String[]args) {
		//java.lang.Cloneable
		int[] ary = new int[5];
		Cloneable clonable = ary;
		
		//java.io.Serializable
		Serializable serializable = ary;
		
		
		System.out.println("super classes:");
		Class clazz = int[].class;
		while( (clazz=clazz.getSuperclass()) != null) {
			System.out.println(clazz.getCanonicalName());
		}
		
		System.out.println("\ninterfaces:");
		clazz = int[].class;
		for(Class inter:clazz.getInterfaces()) {
			System.out.println(inter.getCanonicalName());
		}
		
		
		System.out.println("\npublic members:");
		System.out.println(Arrays.toString(clazz.getFields()));
		
		System.out.println("\ndeclared member methods:");
		System.out.println(Arrays.toString(clazz.getDeclaredMethods()));
		
		
		System.out.println("\nall member methods:");
		for(Method m:clazz.getMethods()) {
			System.out.println(m);
		}
		
	}

}
