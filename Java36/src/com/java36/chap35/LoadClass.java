package com.java36.chap35;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;


public class LoadClass {
	public static void printLoader(Object o) {
		ClassLoader cl = o.getClass().getClassLoader();
		System.out.println(o.getClass().getName()+": "+cl);
	}
	
	public static void main(String...args) throws MalformedURLException, ClassNotFoundException {
		LoadClass loadClass = new LoadClass();
		printLoader(loadClass);
		
		//����������������ص��෵��null��java����е���������������������
		String str = new String("abc");
		printLoader(str);
		
		//
		URL[] url = new URL[]{ new URL( "file:"+System.getProperty("java.class.path") ) };
		URLClassLoader urlLoader = new URLClassLoader(url);
		printLoader(urlLoader);	//��ϵͳ�����������
		
		urlLoader.loadClass("com.java36.chap35.Load");
		Load load = new Load();
		printLoader(load);	//��Ȼ�����Ͽ���Load������URLClassLoader���صģ�������ʵ�Ǳ�parent����ϵͳ����������ص�
	}

}
