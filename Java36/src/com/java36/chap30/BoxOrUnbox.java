package com.java36.chap30;

public class BoxOrUnbox {
	
	public static void main(String[] args) {
		//װ�����
		Integer iObj1 = 1;
		Integer iObj2 = 2;
		
		//�Ȳ�����㣬�ٽ����װ��
		Integer iResult = iObj1 + iObj2;
		
		
		//����2������==�����ִ��װ��or����
		Integer iObj = new Integer(1);
		int i = 1;
		System.out.println(iObj==i);
		//���Ϊtrue��˵��ִ���˲���Ƚ�
	}

}
