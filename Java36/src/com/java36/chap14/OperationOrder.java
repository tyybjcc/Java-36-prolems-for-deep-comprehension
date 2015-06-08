package com.java36.chap14;

import java.io.PrintStream;
import java.util.Arrays;

public class OperationOrder {
	//*
	public static void main(String[] args) {
		PrintStream o = System.out;
		
		o.println("test ++ operation:");
		int i = 5;
		int j = (i++) + (++i) + i + (i=3);
		o.println(j);
		
		
		o.println("\ntest array:");
		int a[] = new int[]{0,0,0,0,0};
		i = 1;
		a[++i] = i++;
		o.println("i="+i);
		o.println("array a:"+Arrays.toString(a));
		
		j=3;
		a[j]=j=4;
		o.println("j="+j);
		o.println("array a:"+Arrays.toString(a));
		
		int[] b = new int[]{9,9,9,9,8,9};
		int k=5;
		int[] c=a;
		a[--k] = (a=b)[k];
		o.println("k="+k);
		o.println("array a:"+Arrays.toString(a));
		o.println("array b:"+Arrays.toString(b));
		o.println("array c:"+Arrays.toString(c));
		
		
	}

}
