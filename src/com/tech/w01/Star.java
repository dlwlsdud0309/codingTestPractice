package com.tech.w01;

public class Star {
	public static void main(String[] args) {
		
		//빗변이 우측에 붙은 역삼각형
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
//				System.out.print(j);
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//빗변이 좌측에 붙은 역삼각형
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
