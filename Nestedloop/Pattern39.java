package com.kn.Nestedloop;

public class Pattern39 {

	public static void main(String[] args) {
		int k=0;
		int l= 0;
		for(int i =1;i<=9;i++) {
			if(i<=5) {
				k++;
			}
			else {
				k--;
			}
			for(int j =1;j<=9;j++) {
				if(j<=k) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
