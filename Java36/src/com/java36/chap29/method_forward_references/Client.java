package com.java36.chap29.method_forward_references;

public class Client {
	
	public static void main(String...args) {
		BlackBear b = new BlackBear();
		System.out.println(b);
		
		//����private���εķ�������ʹ���ඨ������ͬ�ķ���Ҳ������д(override)�����ᵼ�±�����ִ���ڼ䶯̬ѡ����һ������ڸ��๹���������ֳ�����
		Bear b2 = b;
		b2.outerSay();
		
	}

}
