package com.java36.chap35;

public class InitMatter {
	{
		int i=5;
		if(i>3)	throw new Exception();	//���׳��쳣�������й��������벶����쳣
		//return;	//���ɷ���
	}
	
	static {
		//throw new Exception();	//�����׳��쳣
		//return;	//���ɷ���
	}
	InitMatter() throws Exception{
		
	}
	InitMatter(String str) throws Exception {
		
	}

}
