package com.java36.chap29.method_forward_references.v2;

public class MethodForwardReferences {
	
	static class Father{
		
		{
			m1();
		}
		Father() {
			m1();
		}
		void m1() {
			System.out.println("father method 1");
		}
	}
	
	static class Son extends Father {
		String str="abc";
		Son() {
			super();
			m1();
		}
		@Override
		void m1() {
			System.out.println("son method 1");
			//System.out.println(str.toUpperCase());	//will cause error
		}
	}
	
	public static void main(String...args) {
		//���ι������ж����õ���Son�ĳ�Ա�����������߼��ϻ���ɻ�����������
		Son s = new Son();
	}
	

}
