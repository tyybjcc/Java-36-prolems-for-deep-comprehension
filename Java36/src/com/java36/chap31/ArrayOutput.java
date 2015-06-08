package com.java36.chap31;

public class ArrayOutput {
	
	public static void main(String[]args) {
		boolean[] bool = new boolean[2];
		byte[] b = new byte[3];
		short[] s = new short[3];
		char[] c = new char[]{'j','a','v','a'};
		int[] i = new int[3];
		long [] l = new long[3];
		float[] f = new float[3];
		double[] d = new double[3];
		
		String[] str = new String[2];
		Integer[] iObj = new Integer[3];
		
		System.out.println(bool);//Z@
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);//java
		System.out.println(i);
		System.out.println(l);//J@
		System.out.println(f);
		System.out.println(d);
		System.out.println(str);//Ljava.lang.String;@
		System.out.println(iObj);//Ljava.lang.Integer;@
	}

}
