package com.tech.w01;

public class JumpTest {
	public static void main(String[] args) {
		ItemTrans its=new ItemTrans();
		
		its.getItem("점프");
		System.out.println("점프와 포인트 점수 : "+its.getPoint());
		its.getItem("더블점프");
		System.out.println("점프와 포인트 점수 : "+its.getPoint());
		its.getItem("적군킬");
		System.out.println("점프와 포인트 점수 : "+its.getPoint());
	
		System.out.println("최종점수 : "+its.getTotal());
	}
}
