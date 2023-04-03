package com.tech.w01;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <=9; m++) {
			System.out.println("*** "+m+"단 ***");
			for (int n = 2; n <=9; n++) {
				System.out.println(m+" * "+n+" = "+(m*n));
			}
		}
	}
}
