package com.java36.chap32;

public class InterfaceHas {
	
	static interface MyInterface {
		
	}
	
	static class MyImplement implements MyInterface {
		
	}
	
	public static void main(String[] args) {
		MyInterface inter = new MyImplement();
		inter.equals(new Object());
		inter.getClass();
		inter.hashCode();
		try {
			inter.notify();
			inter.notifyAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		inter.toString();
		try {
			inter.wait();
			inter.wait(100);
			inter.wait(10, 10);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Object[] obj = new Object[4];
		
		System.out.println("program end");
	}

}
