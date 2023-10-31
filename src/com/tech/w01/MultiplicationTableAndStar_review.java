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
	}
}
