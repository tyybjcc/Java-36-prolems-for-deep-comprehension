
package com.java36.chap19;

import java.util.Arrays;

public class MaxLengthString {
	
	public static void main(String[] args) {
		
		testMaxLength();
	}
	
	public static int testMaxLength() {
		int high = Integer.MAX_VALUE;
		int low = 1000;
		
		int mid;
		
		while(true) {
			mid = (high+low)>>>1;	//��ʹ��ӳ���Integer.MAX_VALUE�����Ҳ��ȷ
			if(canAllocate(mid)) {
				low = mid;
			}else {
				high = mid;
			}
			System.out.println("range: "+low/1024/1024+"M ~ "+high/1024/1024+"M");
			if( (float)(high-low)/low < 0.001 ) break;	//���С��0.1%��ֹͣ����
		}
		
		return (high+low)/2;
	}
	
	public static boolean canAllocate(int length) {
		try{
			//�˴�ע�⣬һ��char�������ֽ�
			System.out.println(length);
			char[] c = new char[length];
			return true;
		} catch(OutOfMemoryError e) {
			return false;
		}
	}

}
