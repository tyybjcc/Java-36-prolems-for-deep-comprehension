package com.java36.chap23;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

//java reflection -- method invocation
public class MainReflection {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		@SuppressWarnings("unchecked")
		Class<MainReflection> c = (Class<MainReflection>) Class.forName("com.java36.chap23.MainReflection");
		System.out.println(Arrays.toString( c.getDeclaredClasses() ));
		
		@SuppressWarnings("unchecked")
		Class<Main> subClass = (Class<Main>) c.getDeclaredClasses()[0];
		if(subClass==null) throw new ClassNotFoundException();
		
		//��̬����ͨ���������
		Method mStatic = subClass.getDeclaredMethod("main", args.getClass());
		mStatic.invoke(null, (Object)new String[0] );	//����String...��String[]�������β�Ϊ���飬��ʱҪ��ʽת��ΪObject����
		
		//�Ǿ�̬����ͨ���������
		Main main = new Main();
		Method mMember = subClass.getDeclaredMethod("main2");
		mMember.invoke(main);
		
	}
	
	public static class Main {
		public static void main(String...args) {	//String...���﷨�ǣ�����������б�ת��ΪString[]����
			System.out.println("����ྲ̬main����");
			
		}
		public void main2() {
			System.out.println("�������Ǿ�̬main����");
		}
	}

}
