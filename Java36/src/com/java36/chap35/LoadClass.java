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
		
		//由启动类加载器加载的类返回null。java类库中的类均由启动类加载器加载
		String str = new String("abc");
		printLoader(str);
		
		//
		URL[] url = new URL[]{ new URL( "file:"+System.getProperty("java.class.path") ) };
		URLClassLoader urlLoader = new URLClassLoader(url);
		printLoader(urlLoader);	//由系统类加载器加载
		
		urlLoader.loadClass("com.java36.chap35.Load");
		Load load = new Load();
		printLoader(load);	//虽然表面上看，Load类是由URLClassLoader加载的，但它其实是被parent——系统类加载器加载的
	}

}
