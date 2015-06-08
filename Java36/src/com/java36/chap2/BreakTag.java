package com.java36.chap2;

public class BreakTag {
	
	public static void main(String[] args) {
		TAG1:
		for(int i=0;i<10;i++) {
			System.out.println("i="+i);
			for(int j=0;j<10;j++) {
				System.out.println("\tj="+j);
				if(i==1 && j==3)
					break TAG1;
			}
		}
	}

}
