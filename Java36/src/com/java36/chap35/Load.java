package com.java36.chap35;

public class Load {
	
	public static void main(String...args) {
		try {
			ClassLoader loader = ClassLoader.getSystemClassLoader();
			//������м��أ������ӡ� ����һ��protected�����ط��������ݵڶ���boolean����ָ���Ƿ����ӣ�Ĭ��Ϊ������
			Class<?> class1 = loader.loadClass("java.math.BigDecimal");
			Class<?> class2 = loader.loadClass("java.math.BigDecimal");
			//����Ѿ����أ��򷵻�Class����
			System.out.println(class1==class2);
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
