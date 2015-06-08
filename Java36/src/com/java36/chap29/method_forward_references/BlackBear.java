package com.java36.chap29.method_forward_references;

public class BlackBear extends Bear{
	private String color = "black";
	@Override
	public String toString() {
		return super.toString()+", color: " + color;
	}
	private void say() {
		System.out.println("say color: "+color);
	}

}
