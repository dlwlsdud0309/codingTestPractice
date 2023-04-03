package com.tech.w01;

public class ForGuGuExam3 {
	public static void main(String[] args) {
		//전체 구구단
		for (int i = 2; i <=9; i++) {
//			System.out.println("== "+i+"단 ==");
			for (int j = 2; j <=9; j++) {
//				System.out.println(i+" * "+j+" = "+(i*j));
				System.out.print(i+" * "+j+" = "+(i*j)+" ");
			}
			System.out.println("\n");
			System.out.printf("%d 단 \n",i);
		}
	}
}
