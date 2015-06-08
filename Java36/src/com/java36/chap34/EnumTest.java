package com.java36.chap34;

public class EnumTest {
	//enum������final�ģ�������Ϊ˽��
	public enum Enum1 {
		Value1,Value2,Value3;
		//public Enum1(){}	//can only be private
	}
	
	static void showEnum(Enum1 enumValue) {
		System.out.println(enumValue.name());
		System.out.println(enumValue.toString());
	}
	
	public static void main(String...args){
		showEnum(Enum1.Value2);		
	}

}
