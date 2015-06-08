package com.java36.chap35.class_init;

public class ClassInit {
	static {
		System.out.println("ClassInit��ʼ������");
	}
	
	public static void main(String...args) {
		//����main������ʼ��
		
		//������ʵ�������ʼ��
		new ClassInit2();
		
		//�����ྲ̬����
		ClassInit3.staticMethod();
		
		//���þ�̬��Ա
		String field = ClassInit4.Field;
		
		//ʹ��Class.forName���������ࣻ(ע�⣺ClassLoader.loadClass�����������൫����ʼ��)
		try {
			Class.forName("com.java36.chap35.class_init.ClassInit5");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//�����ʼ������ɸ����ʼ��
		new ClassInit6Son();
		
		
		//���ᵼ�����ʼ�������
		System.out.println();
		//��̬��Ա���ʼ�����ᵼ����Χ���ʼ��
		new ClassInit7.ClassInit8();
		//��ʹ��������ò�����ɳ�ʼ��
		ClassInit9 obj = null;
		//ʹ��ClassLoader��loadClass���������࣬�������ʼ��
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		try {
			cl.loadClass("com.java36.chap35.class_init.ClassInit5");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		//�������ֵΪ����ʱ�����ľ�̬����
		
		
	}

}
