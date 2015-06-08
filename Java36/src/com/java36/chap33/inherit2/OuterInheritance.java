package com.java36.chap33.inherit2;

//对应继承：外部类继承外部类，内部类继承内部类
public class OuterInheritance extends Outer{
	class InnerInheritance extends Outer.Inner{	}

	public static void main(String...args) {
		OuterInheritance outer = new OuterInheritance();
		OuterInheritance.InnerInheritance inner = outer.new InnerInheritance();
	}
}
