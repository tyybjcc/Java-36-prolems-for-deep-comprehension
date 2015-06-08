package com.java36.chap29;

public class InitializationOrder {
	
	
	
	
	InitializationOrder() {
		if(this.intvar == 1) {
			System.out.println("instance variable initialization: declare initialization...");
		}
		intvar = 2;
		System.out.println("instance variable initialization: construction initialization...");
	}
	{
		if(this.intvar == 1) {
			System.out.println("instance variable initialization: declare initialization...");
		}
		intvar = 2;
		System.out.println("instance variable initialization: instance initialization block initialization...");
	}
	int intvar = 1;
	
	static int intstatic = 1;
	static {
		if(InitializationOrder.intstatic == 1) {
			System.out.println("static variable initialization: declare initialization...");
		}
		System.out.println("static variable initialization: static initiazation block initialization...");
	}
	
	public static void main(String...args) {
		System.out.println("invoking main...");
		InitializationOrder order = new InitializationOrder();
		
	}
	

}
