package com.tech.w01;

public class MultiplicationTableAndStar_review {
	public static void main(String[] args) {
		//세로 구구단 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
//				System.out.print(j);
				System.out.print(j+" * "+i+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		//가로 구구단 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(i+" * "+j+" = "+(i*j)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("========================");

		//역삼각형
		//    *
		//   ***
		//  *****
		// *******
		//*********
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2-1; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		
		System.out.println("========================");

		//우측에 빗변이 붙은 삼각형
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========================");

		//역피라미드
		//*********
		// *******
		//  *****
		//   ***
		//    *
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 9; j >= i*2-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
