package com.java36.chap29.method_forward_references;

public class Bear {
	private String kind = "bear";
	@Override
	public String toString() {
		return "kind: "+kind;
	}
	public Bear() {
		say();	//˽�з������ܱ��̳У����û�б���д������û�з���ǰ������
		System.out.println(this.toString());
	}
	private void say() {
		System.out.println("say kind: "+kind);
	}
	public void outerSay() {
		this.say();
	}

}
