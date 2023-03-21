package com.tech.w01;

import java.util.Calendar;

public class IfGoodmorning {
	public static void main(String[] args) {
		//Date 객체생성
		
		Calendar calendar=Calendar.getInstance();
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour : "+hour);
		if (hour<=12) {
			System.out.println("Good Morning");
		}else {
			System.out.println("Goud Evening");
		}
	}
}
