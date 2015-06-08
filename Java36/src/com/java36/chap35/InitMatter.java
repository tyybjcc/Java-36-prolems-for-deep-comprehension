package com.java36.chap35;

public class InitMatter {
	{
		int i=5;
		if(i>3)	throw new Exception();	//可抛出异常，但所有构造器必须捕获该异常
		//return;	//不可返回
	}
	
	static {
		//throw new Exception();	//不可抛出异常
		//return;	//不可返回
	}
	InitMatter() throws Exception{
		
	}
	InitMatter(String str) throws Exception {
		
	}

}
