package com.java36.chap22;

public class StringConstant {
	
	public static void main(String[] args) {
		System.out.println( (4+"str1"+1.2) == ("4str11.2") );	//true
		
		final int i = 4;
		final double d = 1.2;
		final String str = "str1";
		System.out.println( (i+str+d) == ("4str11.2") );	//true
		
		int i2 = 4;
		System.out.println( (i2+str+d) == ("4str11.2") );	//false ���ڳ����˳���������ַ�������������ʱ�����������ڶ��ڴ�
		System.out.println( (i+str+d).intern() == ("4str11.2") );	//true ������ַ��������˿���
		
		//����ʱ����ǰ����ľ���ǰ��ɼ��㣬�ܡ����������ַ�����������
		System.out.println( (4*5+"str1") == ("20str1") );	//true
		System.out.println( (4+5.2+"str1") == ("9.2str1") );	//true
	}

}
