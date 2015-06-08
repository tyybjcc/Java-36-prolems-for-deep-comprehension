package com.java36.chap21;

import java.util.AbstractCollection;
import java.util.Vector;

public class ObjectEqualsHashCode {
	
	public static void main(String[]args) {
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj==obj2);
		System.out.println(obj.equals(obj2));
		System.out.println(obj.hashCode());	//由于地址会发生变化，hashCode是不可靠的，程序的每次运行hashCode值会发生变化
		System.out.println(obj2.hashCode());
		
		
	}

}
