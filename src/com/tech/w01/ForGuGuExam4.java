package com.tech.w01;

public class ForGuGuExam4 {
	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 2; j <=9; j++) {
				System.out.printf("%d * %d \t= %2d \t",j,i,i*j); //2d는 한자리 수의 경우 두번째자리에 출력되도록 함
			}
			System.out.println();
		}
	}
}
