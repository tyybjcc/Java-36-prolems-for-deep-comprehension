package com.java36.chap14;

public class CompositeOperation {
	
	//ûʲô�����
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
		s+=s++;	//++û�������ã���Ӱ�챻������
		System.out.println("s="+s);
	}

}
