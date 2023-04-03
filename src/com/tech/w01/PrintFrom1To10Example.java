package com.tech.w01;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
//		for (int i = 1; i <=10; i++) {
//			System.out.println(i+" ");
//		}
//		
//		for (int i = 0,j=0; i <=10 && j<=10; i++, j--) {
//			System.out.println("i : "+i + ",j : "+j);
//		}
		
		int sum=0;
		int i;
		for (i = 1; i <=100; i++) {
			sum+=i;
		}
		System.out.println("1~"+(i-1)+" 합 : "+sum);
		//i가 100보다 같거나 클 때까지이므로 100에서 i++되었을 때 101이 된다.
	}
}
