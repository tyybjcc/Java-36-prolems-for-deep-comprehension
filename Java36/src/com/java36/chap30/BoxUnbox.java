package com.java36.chap30;

public class BoxUnbox {
	
	public static void main(String...args){
		//boxing
		Integer iObj = Integer.valueOf(5);
		//unboxing
		int i = iObj.intValue();
		
		//valueOf��̬����������
		Long lObj = Long.valueOf("23");
		System.out.println(lObj);
		
	}

}
