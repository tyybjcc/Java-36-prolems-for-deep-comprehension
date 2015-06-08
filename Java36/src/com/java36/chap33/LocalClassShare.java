package com.java36.chap33;

public class LocalClassShare {
	static int state = 3;
	
	
	public static void main(String...args) {
		class Class1 {
			int state = LocalClassShare.state;
			{
				LocalClassShare.state++;
			}
		}
		for(int i=0;i<5;i++) {
			new Class1();
			System.out.println(state);
		}
	}

}
