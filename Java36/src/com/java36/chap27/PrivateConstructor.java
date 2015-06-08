package com.java36.chap27;

public class PrivateConstructor {
	static class Super {
		private Super(){}
	}
	
	static class Sub extends Super {
		private Sub() {
			super();
		}
	}
	
	public static void main(String...args) {
		Sub sub = new Sub();
	}

}
