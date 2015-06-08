package com.java36.chap34;

public class InitializationOrder {
	
	enum MyEnum {
		Enum1("enum1"),Enum2("enum2");
		
		
		private static String str = "enum";
		private final static String str2 = "enum";
		private String enumText;
		MyEnum(String enumText) {
			this.enumText = enumText;
			//System.out.println(str);	//Cannot refer to the static enum field InitializationOrder.MyEnum.str within an initializer
			System.out.println(str2);
		}
		
		
	}
	
	
	public static void main(String...args) {
		System.out.println( MyEnum.Enum1 );
		System.out.println(MyEnum.valueOf("Enum1"));
	}

}
