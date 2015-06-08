package com.java36.chap4;

public class ValidIdentifier2 {
	//�ж�Unicode�ߴ���Χ�͵ʹ���Χ�ǲ�����Ч��java��ʶ��
	//���ValidChar�࣬���Կ��������ߴ���Χ�͵ʹ���Χ��Unicodeת�岻����Ч��char�ַ�������ǣ���������ַ���ɻ�����
	public static void main(String[] args) {
		int highSurrogateMin = 0xd800;
		int highSurrogateMax = 0xdbff;
		int lowSurrogateMin = 0xdc00;
		int lowSurrogateMax = 0xdfff;
		
		int highValidCount=0;
		int lowValidCount=0;
		
		for(int i=highSurrogateMin; i<=highSurrogateMax; i++) {
			if(Character.isJavaIdentifierPart(i)) {
				highValidCount++;
			}
		}
		
		for(int i=lowSurrogateMin; i<=lowSurrogateMax; i++) {
			if(Character.isJavaIdentifierPart(i)) {
				lowValidCount++;
			}
		}
		
		System.out.println("highValidCount: " + highValidCount);	//result: 0
		System.out.println("lowValidCount: " + lowValidCount);	//result: 0
		
	}

}
