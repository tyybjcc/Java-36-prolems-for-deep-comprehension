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
		long l = 5L;	//long不能作为switch表达式
		switch(b){}
		switch(s){}
		switch(c){}
		switch(i){}
		// switch(l){}	//cannot switch on a type of value long
		
		//boxed basic types
		Byte bBox = 1;	//直接赋值，类型转换和装箱由编译器完成，是最简洁的方式
		Short sBox = new Short((short) 2);	//类型转换和装箱操作手动完成
		Character cBox = new Character((char)3);
		Integer iBox = new Integer(4);
		switch(bBox) {
		case 1:		//此处1被编译器认为是byte类型的1
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
		default:	//虽然语法没有要求default语句放在最后，但default语句应该放在最后（由于是最后一条语句了，因此可以省略break）
			System.out.println("unknown name");
		}
		
		//Enum
		Color3 color3 = Color3.GREEN;
		switch(color3) {
		case GREEN:	//非常值得注意的一点是，Color3已经被省略了（而且不能写），非常简洁
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
