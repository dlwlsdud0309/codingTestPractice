package com.tech.w01;

import java.util.Scanner;

public class Ifmission {
	public static void main(String[] args) {
		
//		String id="blue";
//		String pass="";
		
		//id 일치검사 후,
		//맞으면 pass 1234
		//틀리면 4567
		
		//pass 일치검사 후,
		//1234가 맞으면 "통과"출력
		//틀리면 "출입금지"출력
		
		//문자열 비교는 equals 사용
		
		Scanner sc=new Scanner(System.in);
		String id="";
		String pass="";
		while(true) {
			System.out.println("id : "+sc.next());
			System.out.println("pass : "+sc.next());

			if (id.equals("blue")) {
				pass="1234";
			}else {
				pass="4567";
			}
			
			if (pass.equals("1234")) {
				System.out.println("통과");
			}else {
				System.out.println("출입금지");
			}
			break;
		}
		
		
			
	}
}
