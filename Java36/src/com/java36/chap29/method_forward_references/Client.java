package com.java36.chap29.method_forward_references;

public class Client {
	
	public static void main(String...args) {
		BlackBear b = new BlackBear();
		System.out.println(b);
		
		//对于private修饰的方法，即使父类定义了相同的方法也不是重写(override)，不会导致编译器执行期间动态选择。这一点可以在父类构造器中体现出来。
		Bear b2 = b;
		b2.outerSay();
		
	}

}
