package com.java36.chap5;

public class IntegerRange {
	
	public static void main(String[] args) {
		//byteRange1();
		byteRange2();
		charRange();
		shortRange();
		intRange();
		longRange();
		
		System.out.println("\nmax integer:"+Integer.MAX_VALUE);
		System.out.println("max short: "+Short.MIN_VALUE);
		
	}
	
	public static void byteRange1() {
		byte b = 0;
		while(true) {
			byte b0 = b;
			b++;
			if(b<b0) {
				System.out.println("byte range: "+b+"~"+b0);
				break;
			}
		}
	}
	
	public static void byteRange2() {
		System.out.println("byte range: "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
	}
	
	public static void charRange() {
		System.out.println("char range: 0x"+ Integer.toHexString(Character.MIN_VALUE) +"~0x"+ Integer.toHexString(Character.MAX_VALUE));
	}
	
	public static void shortRange() {
		System.out.println("short range: 0x"+ Integer.toHexString(Short.MIN_VALUE) +"~0x"+ Integer.toHexString(Short.MAX_VALUE));
	}
	
	public static void intRange() {
		System.out.println("int range: 0x"+ Integer.toHexString(Integer.MIN_VALUE) +"~0x"+ Integer.toHexString(Integer.MAX_VALUE));
	}
	
	public static void longRange() {
		System.out.println("long range: 0x"+ Long.toHexString(Long.MIN_VALUE) +"~0x"+ Long.toHexString(Long.MAX_VALUE));
	}
	
	

}
