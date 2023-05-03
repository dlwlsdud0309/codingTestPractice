package com.tech.w01;

public class OrderUtil {
	private static int count; //1
	private int count2;
	
	public static void main(String[] args) {
		OrderUtil u1=new OrderUtil();
		OrderUtil u2=new OrderUtil();
		OrderUtil u3=new OrderUtil();
	
		u1.pressButton();
		u1.pressButton();
		u1.pressButton();
		u2.pressButton();
	
		u1.pressButton2();
		u1.pressButton2();
		u1.pressButton2();
		u2.pressButton2();
		u2.pressButton2();
	}
	
	public void pressButton() {
		count++;
		System.out.println("고객님 순서는 "+count+"번째 입니다.");
	}
	public void pressButton2() {
		count2++;
		System.out.println("고객님 순서는 "+count2+"번째 입니다.");
	}
}
