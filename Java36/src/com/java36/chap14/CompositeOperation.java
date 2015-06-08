package com.java36.chap14;

public class CompositeOperation {
	
	//没什么特殊的
	public static void main(String[] args) {
		//composite operation
		short s=10;
		s+=10;
		System.out.println("s="+s);
		//the same with: s=(short)(s+10)
		s=10;
		s=(short)(s+10);
		System.out.println("s="+s);
		
		
		//composite operation order
		s=10;
		s+=++s;
		System.out.println("s="+s);
		s=10;
		s+=s++;	//++没有起作用，其影响被覆盖了
		System.out.println("s="+s);
	}

}
