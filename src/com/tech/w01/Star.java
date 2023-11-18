package com.tech.w01;

import java.util.Iterator;

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
			for (int j = 5; j > i; j--) { //j는 5부터 i보다 작을 때까지, 5부터 증감
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//역피라미드
		for (int i = 0; i < 9; i++) { //9줄
			for (int j = 1; j <= i; j++) { //i는 0에서 8까지 존재, j는 1부터 i가 1일 때 까지 공백, 그러므로 총 8줄
				System.out.print(" ");
			}
			for (int j = 9; j >= i*2-1; j--) { //j는 9에서 홀수인 9,7,5,3,1에 해당하는 i보다 크거나 같을 때까지 감소
				System.out.print("*"); //11
			}
			System.out.println();
		}
		
		//공백과 11개의 별이 출력되는 이유
		for (int i = 0; i < 9; i++) {
			for (int j = 9; j >= i*2-1; j--) {
				System.out.print(j); //j가 후위연산자이기 때문에 9에서부터 0까지, 0에 해당하는 -1도 출력되어 총 11개의 숫자
			}
			System.out.println();
		}
		
		//역피라미드(구분 위해 !로 대체)
		//*********
		// *******
		//  *****
		//   ***
		//    *
		for (int i = 1; i <= 5; i++) {
			//공백부터
			for (int j = 1; j < i; j++) { //j는 1부터 i보다 작을 때까지, i는 최대 5, j는 1,2,3,4까지
				System.out.print(" ");
			}
			for (int j = 9; j >= i*2-1; j--) {
//					for (int j = 1; j <= 2 * (5 - i) + 1; j++) {
				System.out.print("*");
			}
				
			System.out.println();
		}
		//피라미드
		for (int i = 2; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2-1; j++) {
				System.out.print("*");
//				System.out.print(i+","+j+" ");
//				if(j==5 && i*2-1==9) { //i가 5일때 j는 
//					System.out.print(i+","+j);
//				}
			}
			System.out.println();
		}
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
