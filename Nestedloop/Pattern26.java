package com.kn.Nestedloop;

public class Pattern26 {

	public static void main(String[] args) {
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j<=6&&j-i>=0&& i<=3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
