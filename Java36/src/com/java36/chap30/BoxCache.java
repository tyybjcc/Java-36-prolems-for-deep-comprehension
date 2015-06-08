package com.java36.chap30;

public class BoxCache {
	
	//仅使用Integer.valueOf(int):Integer 才能利用缓存
	public static void main(String[] args) {
		
		//new Integer()不能利用缓存
		Integer I = new Integer(1);
		Integer I2 = new Integer(1);
		System.out.println(I==I2);
		
		//valueOf可以利用缓存
		Integer I3 = Integer.valueOf(2);
		Integer I4 = Integer.valueOf(2);
		System.out.println(I3==I4);
		
		byteCacheRange();
		shortCacheRange();
		characterCacheRange();
		integerCacheRange();
	}
	
	public static void byteCacheRange() {
		byte start = 2;
		byte end = 2;
		for(byte s = Byte.MIN_VALUE; s<Byte.MAX_VALUE; s++) {
			boolean equals = Byte.valueOf(s)==Byte.valueOf(s);
			if(equals) {
				if(start==2)	start = s;
				end = s;
			}
			else if(start!=2) {
				break;
			}
		}
		if(end==Byte.MAX_VALUE-1 && Byte.valueOf(Byte.MAX_VALUE)==Byte.valueOf(Byte.MAX_VALUE)) {
			end = Byte.MAX_VALUE;
		}
		System.out.println("Byte Cache range: "+start+" ~ "+end);
	}
	
	public static void shortCacheRange() {
		short start = 2;
		short end = 2;
		for(short s = Short.MIN_VALUE; s<Short.MAX_VALUE; s++) {
			boolean equals = Short.valueOf(s)==Short.valueOf(s);
			if(equals) {
				if(start==2)	start = s;
				end = s;
			}
			else if(start!=2) {
				break;
			}
		}
		if(end==Short.MAX_VALUE-1 && Short.valueOf(Short.MAX_VALUE)==Short.valueOf(Short.MAX_VALUE)) {
			end = Short.MAX_VALUE;
		}
		System.out.println("Short Cache range: "+start+" ~ "+end);
	}
	
	public static void characterCacheRange() {
		char start = 2;
		char end = 2;
		for(char s = Character.MIN_VALUE; s<Character.MAX_VALUE; s++) {
			boolean equals = Character.valueOf(s)==Character.valueOf(s);
			if(equals) {
				if(start==2)	start = s;
				end = s;
			}
			else if(start!=2) {
				break;
			}
		}
		if(end==Character.MAX_VALUE-1 && Character.valueOf(Character.MAX_VALUE)==Character.valueOf(Character.MAX_VALUE)) {
			end = Character.MAX_VALUE;
		}
		System.out.println("Character Cache range: "+(int)start+" ~ "+(int)end);
	}
	
	public static void integerCacheRange() {
		int start = 2;
		int end = 2;
		for(int s = Integer.MIN_VALUE; s<Integer.MAX_VALUE; s++) {
			boolean equals = Integer.valueOf(s)==Integer.valueOf(s);
			if(equals) {
				if(start==2)	start = s;
				end = s;
			}
			else if(start!=2) {
				break;
			}
		}
		if(end==Integer.MAX_VALUE-1 && Integer.valueOf(Integer.MAX_VALUE)==Integer.valueOf(Integer.MAX_VALUE)) {
			end = Integer.MAX_VALUE;
		}
		System.out.println("Integer Cache range: "+start+" ~ "+end);
	}
	
	//其他省略
	
	
	
	

}
