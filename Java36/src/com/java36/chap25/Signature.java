package com.java36.chap25;

import java.util.List;

public class Signature {
	
	static class Super {
		public void mSuper1(List<Number> arg){}
		
		public <T extends Super> void mSuper2(T data) { }
		
		public void mSuper3(Super data){}
	}
	
	//重写方法的签名要是父类方法签名的子签名
	static class Sub extends Super {
		@Override
		public void mSuper1(List arg){}
		@Override
		public void mSuper2(Super data){}
		
		/*
		@Override
		public <T extends Super> void mSuper3(T data) {}
		*/
		
	}

}
