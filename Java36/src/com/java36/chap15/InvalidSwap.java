package com.java36.chap15;

public class InvalidSwap {
	private static class Value {
		private int v;
		private String str;
		Value(int _v, String _str) {
			this.v = _v;
			this.str=_str;
		}
		@Override
		public String toString() {
			return "Value:"+v+","+str;
		}
	}
	
	public static void main(String[]args) {
		int a=1,b=2;
		invalidSwap(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		Integer aBox = new Integer(1);
		Integer bBox = new Integer(2);
		invalidSwap(aBox,bBox);
		System.out.println("aBox="+aBox);
		System.out.println("bBox="+bBox);
		
		aBox = new Integer(1);
		bBox = new Integer(2);
		objectSwap(aBox,bBox);
		System.out.println("aBox="+aBox);
		System.out.println("bBox="+bBox);
		
		Value v1 = new Value(1,"str1");
		Value v2 = new Value(2,"str2");
		objectSwap(v1,v2);
		System.out.println(v1);
		System.out.println(v2);
		
		
	}
	
	//ֵ����
	public static void invalidSwap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
	}
	
	//���ô��ݣ����� ���β����ý���
	public static void invalidSwap(Integer a, Integer b) {
		Integer temp = a;
		a=b;
		b=temp;
	}
	
	//ͬ�����β����ý���
	public static void objectSwap(Object a, Object b) {
		Object temp = a;
		a=b;
		b=temp;
	}
	
	
	

}
