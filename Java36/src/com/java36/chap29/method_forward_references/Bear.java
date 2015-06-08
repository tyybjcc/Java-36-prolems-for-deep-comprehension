package com.java36.chap29.method_forward_references;

public class Bear {
	private String kind = "bear";
	@Override
	public String toString() {
		return "kind: "+kind;
	}
	public Bear() {
		say();	//私有方法不能被继承，因此没有被重写，所以没有发生前向引用
		System.out.println(this.toString());
	}
	private void say() {
		System.out.println("say kind: "+kind);
	}
	public void outerSay() {
		this.say();
	}

}
