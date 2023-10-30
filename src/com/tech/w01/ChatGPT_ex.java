package com.tech.w01;

public class ChatGPT_ex {
	public static void main(String[] args) {
		
		// 구구단 출력하기
		//세로
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j < 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			if(i<9) {
				System.out.println("===========");
			}
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		
		//가로
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j < 9; j++) {
				if(i*j<10) {
					System.out.print(j+" * "+i+" =  "+(j*i));
				}else {
					System.out.print(j+" * "+i+" = "+(j*i));
				}
				System.out.print(" | ");
			}
			System.out.println();
		}

		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		
		//숫자 피라미드
		//12345
		// 2345
		//  345
		//   45
		//    5
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("===================");
		
		//1
		//12
		//123
		//1234
		//12345
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
				
	}
}
