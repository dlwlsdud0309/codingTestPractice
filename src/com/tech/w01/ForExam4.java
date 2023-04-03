package com.tech.w01;

public class ForExam4 {
	public static void main(String[] args) {
		
		//i가 짝수일 경우 누적 값,
		//i가 홀수일 경우 누적 값 구하기
		
		int even=0; //짝수
		int odd=0; //홀수
		
		for (int i = 1; i <=10; i++) {
			if (i%2==0) {
				even+=i;
			}else if(i%2!=0) {
				odd+=i;
			}
		}
		
		System.out.println("even : "+even);
		System.out.println("odd : "+odd);
	}
}
