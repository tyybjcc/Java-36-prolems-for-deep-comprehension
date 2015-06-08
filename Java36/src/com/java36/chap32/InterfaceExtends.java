package com.java36.chap32;

public class InterfaceExtends {
	static interface Inter1 {
		String name = "name1";
	}
	static interface Inter2 {
		String name = "name2";
	}
	
	static interface Inter3 extends Inter1, Inter2 {
		//String myName = name;
		String myName = Inter1.name;
		String myName2 = Inter2.name;
	}
	

}
