package com.java36.chap12;


public class ShiftNumTest {
	
	public static void main(String[] args) {
		//���ͻ�������Ϊ���͵����� ��λ���� ȡ��λλ�����ֵ����5λ
		
		System.out.println(23>>1);
		System.out.println(23>>33);
		System.out.println(23 >> 22342234345345L);
		System.out.println(23>>-31);
		
		//ʵ���ϣ���λ�Ķ����Ǹ���shiftNum�����5λ��6λȷ���ģ�����һԭ����Ը�����ģ���������ͣ������realShiftNum(int|long)
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
	
	//ͨ����ģҲ���Լ�����ʵ��λ����������ģ���㲢���ܷ�ӳ��λ������̶˶�ʣ�����Ӧ�������5��6λ��Ч��
	public static int realShiftNum2(int shiftNum) {
		return (shiftNum%32+32)%32;
	}
	public static int realShiftNum2(long shiftNum) {
		return ((int)shiftNum%64+64)%64;
	}

}
