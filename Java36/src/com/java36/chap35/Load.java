package com.java36.chap35;

public class Load {
	
	public static void main(String...args) {
		try {
			ClassLoader loader = ClassLoader.getSystemClassLoader();
			//对类进行加载，不链接。 其有一个protected的重载方法，传递第二个boolean参数指定是否链接，默认为不链接
			Class<?> class1 = loader.loadClass("java.math.BigDecimal");
			Class<?> class2 = loader.loadClass("java.math.BigDecimal");
			//如果已经加载，则返回Class对象
			System.out.println(class1==class2);
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
