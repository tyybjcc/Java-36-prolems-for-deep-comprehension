package com.java36.chap28;

public class Initialization2 {
	
	static class Son extends Father{
		static int staticVarHidden = 2;
		int memberVarHidden = 2;
		
	}
	
	static class Father {
		static int staticVar = 1;
		static int staticVarHidden = 1;
		int memberVar = 1;
		int memberVarHidden = 1;
	}
	
	public static void main(String...args) {
		Father f = new Father();
		Son s = new Son();
		System.out.println("father:");
		System.out.println("static var: "+f.staticVar);
		System.out.println("static var hidden: "+f.staticVarHidden);
		System.out.println("member var: "+f.memberVar);
		System.out.println("member var hidden: "+f.memberVarHidden);
		
		System.out.println("\nson:");
		System.out.println("static var: "+s.staticVar);
		System.out.println("static var hidden: "+s.staticVarHidden);
		System.out.println("member var: "+s.memberVar);
		System.out.println("member var hidden: "+s.memberVarHidden);
		
		Father f2 = s;
		System.out.println("\nfather reference son:");
		System.out.println("static var: "+f2.staticVar);
		System.out.println("static var hidden: "+f2.staticVarHidden);
		System.out.println("member var: "+f.memberVar);
		System.out.println("member var hidden: "+f2.memberVarHidden);
		
	}

}
