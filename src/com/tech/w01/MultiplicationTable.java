package com.tech.w01;

public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
//			System.out.println("2 * "+i+" = "+(2*i));
//			System.out.print(i);
			for (int j = 2; j <= 9; j++) {
				System.out.print(i+" * "+j+" = "+(i*j)+"\t");
			}
			System.out.println();
		}
		
		
	}
	
}
