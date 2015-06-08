package com.java36.chap4;

public class UnicodeChinese {
	//一般用4E00－9FA5已经可以，如果要更广，则用2E80－A4CF  ||   F900-FAFF　||　FE30-FE4F
	public static void main(String[] args) {
		char cnMin=0x4e00;
		char cnMax=0x9fa5;
		
		int lineBreakCount = 0;
		for(char cn=cnMin; cn<=cnMax; cn++) {
			System.out.print(cn + " ");
			if(++lineBreakCount==100) {
				lineBreakCount = 0;
				System.out.println();
			}
		}
	}

}
