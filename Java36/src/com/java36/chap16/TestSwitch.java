package com.java36.chap16;

public class TestSwitch {
	enum Color3{
		RED,GREEN,BLUE
	}
	
	public static void main(String[] args) {
		
		//basic types
		byte b = 1;
		short s = 2;
		char c = 3;
		int i = 4;
		long l = 5L;	//long������Ϊswitch���ʽ
		switch(b){}
		switch(s){}
		switch(c){}
		switch(i){}
		// switch(l){}	//cannot switch on a type of value long
		
		//boxed basic types
		Byte bBox = 1;	//ֱ�Ӹ�ֵ������ת����װ���ɱ�������ɣ�������ķ�ʽ
		Short sBox = new Short((short) 2);	//����ת����װ������ֶ����
		Character cBox = new Character((char)3);
		Integer iBox = new Integer(4);
		switch(bBox) {
		case 1:		//�˴�1����������Ϊ��byte���͵�1
			System.out.println("byte 1");
			break;
		}
		switch(sBox) {}
		switch(cBox) {}
		switch(iBox) {}
		
		//String
		String name = "frank";
		switch(name) {
		case "bob":
			System.out.println("name is bob");
			break;
		case "john":
			System.out.println("name is john");
			break;
		case "frank":
			System.out.println("name is frank");
			break;
		default:	//��Ȼ�﷨û��Ҫ��default��������󣬵�default���Ӧ�÷���������������һ������ˣ���˿���ʡ��break��
			System.out.println("unknown name");
		}
		
		//Enum
		Color3 color3 = Color3.GREEN;
		switch(color3) {
		case GREEN:	//�ǳ�ֵ��ע���һ���ǣ�Color3�Ѿ���ʡ���ˣ����Ҳ���д�����ǳ����
			System.out.println("the color is green");
			break;
		case RED:
			System.out.println("the color is red");
			break;
		case BLUE:
			System.out.println("the color is blue");
			break;
		default:
			System.out.println("unknown color");
			
		}
		
		
		
		
		
		
		
	}

}
