package com.java36.chap33.inherit2;

//��Ӧ�̳У��ⲿ��̳��ⲿ�࣬�ڲ���̳��ڲ���
public class OuterInheritance extends Outer{
	class InnerInheritance extends Outer.Inner{	}

	public static void main(String...args) {
		OuterInheritance outer = new OuterInheritance();
		OuterInheritance.InnerInheritance inner = outer.new InnerInheritance();
	}
}
