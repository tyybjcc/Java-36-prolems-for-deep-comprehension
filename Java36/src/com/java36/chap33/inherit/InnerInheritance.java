package com.java36.chap33.inherit;

public class InnerInheritance extends Outer.Inner{
	public InnerInheritance(Outer outer) {
		outer.super();
		//������൱��: super(outer);
	}
}
