package com.java36.chap21;

import java.util.AbstractCollection;
import java.util.Vector;

public class ObjectEqualsHashCode {
	
	public static void main(String[]args) {
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj==obj2);
		System.out.println(obj.equals(obj2));
		System.out.println(obj.hashCode());	//���ڵ�ַ�ᷢ���仯��hashCode�ǲ��ɿ��ģ������ÿ������hashCodeֵ�ᷢ���仯
		System.out.println(obj2.hashCode());
		
		
	}

}
