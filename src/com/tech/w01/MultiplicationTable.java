package com.tech.w01;

public class MultiplicationTable {
	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for (int i = 1; i < 5; i++) {
//			for (int j = i; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		System.out.println("======");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("i="+i+" "+"j="+j+"\t"); //가로 정렬, i가 0일 때 j가 4까지 출력되며 종료
			}
			System.out.println(); //이후 enter되어 반복, i가 1일 때 j는 4까지 반복
		}
		
		System.out.println("======");
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if ((j*i)<10) {
					System.out.print(j+" * "+i+" = "+"  "+(j*i));
				} else {
					System.out.print(j+" * "+i+" = "+" "+(j*i));
				}
				System.out.print("  |  ");
			}
			System.out.println();
		}
		
		
		System.out.println("======");
		for (int i = 2; i <= 9; i++) {
//			System.out.print("i = "+i+" ");
//			System.out.print("2 * "+i+" = "+(2*i)+" ");
			for (int j = 2; j <= 9; j++) {
//				System.out.print(i+","+j+"\t");
//				System.out.print("j = "+j+" ");
				if((i*j)<10) {
					System.out.print(i+" * "+j+" =  "+(i*j)+"\t");
				}else {
				System.out.print(i+" * "+j+" = "+(i*j)+"\t");
				}
			}
			System.out.println();
		}
		System.out.println("======");
		
	}
	
}
