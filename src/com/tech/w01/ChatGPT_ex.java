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
	}
}
