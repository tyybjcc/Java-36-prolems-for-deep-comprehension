package com.java36.chap35;

public class ClassLoaderPath {
	//�����������·��
	//��չ�������·������ͨ��jvm�����������ã�java -Djava.class.path=.;C: -Djava.ext.dirs=C:;D:
	public static void main(String[]args) {
		//�����������·��
		System.out.println(System.getProperty("sun.boot.class.path"));
		//��չ�������·��
		System.out.println(System.getProperty("java.ext.dirs"));
		//ϵͳ�������·��
		System.out.println(System.getProperty("java.class.path"));
	}

}
