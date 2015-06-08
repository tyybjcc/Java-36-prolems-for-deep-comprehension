package com.java36.chap12;

public class PermanentNegitiveOne {
	
	public static void main(String[] args) {
		case1();
		
		System.out.println();
		case2();
		case3();
	}
	
	//-1 right shift is permanent -1
	public static void case1() {
		int i = -1;
		for(int shiftNum=0;shiftNum<100;shiftNum++) {
			System.out.println( (i>>shiftNum) +": "+ (Integer.toBinaryString(i>>shiftNum)) );
		}
	}
	
	//byte b=-1; loop{ b>>>=1; } 此时，b永远是-1
	public static void case2() {
		byte b = -1;
		byte b2 = -1;
		
		System.out.println("Byte size: "+Byte.SIZE);
		for(int i=0;i<Byte.SIZE*4;i++) {
			b >>>= 1;
			System.out.println("b>>=1: "+ b);
			System.out.println("b2>>>"+i+": "+ (b2>>>i));	//c此时是整数
			System.out.println("-------");
		}
	}
	
	//short s=-1; loop{ s>>>=1; } 此时，s永远是-1
	public static void case3() {
		short s = -1;
		for(int i=0;i<Short.SIZE; i++) {
			s>>>=1;
			System.out.println(s);
		}
	}

}
