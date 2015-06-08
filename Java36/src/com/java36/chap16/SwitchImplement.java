package com.java36.chap16;

import com.java36.chap16.TestSwitch.Color3;

public class SwitchImplement {
	
	//模拟编译器对switch底层的实现
	public static void main(String[] args) {
		//Integer类型模拟实现，Byte、Short、Character类型类似。( 利用 bBox.byteValue(),cBox.charValue(),sBox.shortValue() )
		simuInt();
		
		//通过enumValue.ordinal()实现
		simuEnum();
		
		//通过str.hashCode()实现
		simuString();
		
		
		
	}
	
	public static void simuInt() {
		Integer iBox = 3;
		//implemented by compiler
		switch(iBox) {
		case 1:
			System.out.println("integer 1");
			break;
		case 2:
			System.out.println("integer 2");
			break;
		case 3:
			System.out.println("integer 3");
			break;
		default:
			System.out.println("integer other than 1,2,3");
		}
		
		//simulate compiler manually
		switch(iBox.intValue()) {
		case 1:
			System.out.println("integer 1");
			break;
		case 2:
			System.out.println("integer 2");
			break;
		case 3:
			System.out.println("integer 3");
			break;
		default:
			System.out.println("integer other than 1,2,3");
		}
	}
	
	public static void simuEnum() {
		Color3 color3 = Color3.GREEN;
		//implemented by compiler
		switch(color3) {
		case RED:
			System.out.println("the color is red");
			break;
		case GREEN:
			System.out.println("the color is green");
			break;
		case BLUE:
			System.out.println("the color is blue");
			break;
		default:
			System.out.println("unknown color");
		}
		
		
		//manually 书上给的方法
		final int[] $SwitchMap$package$Color3 = new int[Color3.values().length]; 
		$SwitchMap$package$Color3[Color3.RED.ordinal()] = 1;
		$SwitchMap$package$Color3[Color3.GREEN.ordinal()] = 2;
		$SwitchMap$package$Color3[Color3.BLUE.ordinal()] = 3;
		//
		switch($SwitchMap$package$Color3[color3.ordinal()]) {
		case 1:
			System.out.println("the color is red");
			break;
		case 2:
			System.out.println("the color is green");
			break;
		case 3:
			System.out.println("the color is blue");
			break;
		default:
			System.out.println("unknown color");
		
		}
		
		//manually 2 
		//0,1,2通过Color3.RED.ordinal(),Color3.GREEN.ordinal(),Color3.BLUE.ordinal()
		switch( color3.ordinal() ) {
		case 0:
			System.out.println("the color is red");
			break;
		case 1:
			System.out.println("the color is green");
			break;
		case 2:
			System.out.println("the color is blue");
			break;
		default:
			System.out.println("unknown color");
		}
	}
	
	public static void simuString() {
		//by compiler
		String name = "name2";
		switch(name){
		case "name1":
			System.out.println("name1");
			break;
		case "name2":
			System.out.println("name2");
			break;
		case "name3":
			System.out.println("name3");
			break;
		default:
			System.out.println("nameDefault");
		}
		
		//manually simulation (by me)
		switch(name.hashCode()) {
		case 104584966:
			if(name.equals("name1")) {
				System.out.println("name1");
				break;
			}
		case 104584967:
			if(name.equals("name2")) {
				System.out.println("name2");
				break;
			}
		case 104584968:
			if(name.equals("name3")) {
				System.out.println("name3");
				break;
			}
		default:
			System.out.println("nameDefault");
		}
		
		//manually simulation2(Java36)
		byte b = -1;
		switch(name.hashCode()) {
		case 104584966:
			if(name.equals("name1")) {
				b = 0;
			}
			break;
		case 104584967:
			if(name.equals("name2")) {
				b = 1;
			}
			break;
		case 104584968:
			if(name.equals("name3")) {
				b = 2;
			}
			break;
		}
		switch(b) {
		case 0:
			System.out.println("name1");
			break;
		case 1:
			System.out.println("name2");
			break;
		case 2:
			System.out.println("name3");
			break;
		default:
			System.out.println("nameDefault");
		}
		
	}
	

}
