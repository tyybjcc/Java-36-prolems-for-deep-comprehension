package com.java36.chap27;

//测试构造器是否在创建对象前被调用（也就是是不是构造器创建了对象）
public class WhatConstructorDo {
	private int i;
	public WhatConstructorDo(int i) {
		this.i=i;
	}
	
	public static void main(String... args) {
		
		WhatConstructorDo[] ary = getMaxArraySize();
		System.out.println(ary.length);
		
		
		
		int mark = 0;
		for(int i=0; i< ary.length; i++) {
			try {
				if(i%10000==0)	System.out.println(i/10000);
				ary[i] = new WhatConstructorDo(mark=1);
				mark = 0;
			} catch(Error e) {
				e.printStackTrace();
				System.out.println("mark="+mark);
				break;
			}
		}
		
	}
	
	public static  WhatConstructorDo[] getMaxArraySize() {
		int low = 1;
		int high = Integer.MAX_VALUE;
		int mid=(low+high)>>>1;
		
		WhatConstructorDo[] ary = new WhatConstructorDo[0];

		while(mid!=low) {
			///System.out.println(low+"~"+high);
			try {
				ary = new WhatConstructorDo[mid];
				low = mid;
			} catch(OutOfMemoryError e) {
				high = mid-1;
			}
			mid = (low+high)>>>1;
		}
		return ary;
	}

}
