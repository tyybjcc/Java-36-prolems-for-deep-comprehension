package com.java36.chap36;

public class ClassHidden extends SuperClassHidden{
	public class ClassHidden2 {	}
	
	public static void main(String[] args) {
		//���ڶ���:ͬһ�������า�����ͬ����
		System.out.println(ClassHidden.class);
		//�ɴ˼��ˣ������ж�����า�Ǹ����е�ͬ����
		System.out.println(ClassHidden2.class);
	}
}
