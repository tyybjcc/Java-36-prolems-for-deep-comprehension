package com.java36.chap12;


public class ShiftNumTest {
	
	public static void main(String[] args) {
		//整型或提升后为整型的类型 移位操作 取移位位数数字的最低5位
		
		System.out.println(23>>1);
		System.out.println(23>>33);
		System.out.println(23 >> 22342234345345L);
		System.out.println(23>>-31);
		
		//实际上，移位的多少是根据shiftNum的最低5位或6位确定的，但这一原理可以根据求模运算来阐释，具体见realShiftNum(int|long)
		System.out.println();
		System.out.println(Integer.toBinaryString(-31));
		
		
		//test realShiftNum function(int|long)
		System.out.println("\nReal shift num:");
		System.out.println(realShiftNum( 22342234345345L));
		System.out.println(realShiftNum( -31));
		System.out.println(realShiftNum(1));
		System.out.println(realShiftNum2( 22342234345345L));
		System.out.println(realShiftNum2( -31));
		System.out.println(realShiftNum2(1));
	}
	
	public static int realShiftNum(int shiftNum) {
		return (0x1f&shiftNum);
	}
	
	public static int realShiftNum(long shiftNum) {
		return (int)(0x3f&shiftNum);
	}
	
	//通过求模也可以计算真实移位数，但是求模运算并不能反映移位计算过程端额本质（本质应该是最低5或6位有效）
	public static int realShiftNum2(int shiftNum) {
		return (shiftNum%32+32)%32;
	}
	public static int realShiftNum2(long shiftNum) {
		return ((int)shiftNum%64+64)%64;
	}

}
