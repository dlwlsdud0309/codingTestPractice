package com.tech.w01;

public class AClassTest extends AClass{
	public static void main(String[] args) {
//		AClass ac=new AClass();
		
		AClassTest act=new AClassTest();
//		System.out.println(act.i); //private
		System.out.println(act.k); //default, 패키지가 다르면 사용할 수 없음
		System.out.println(act.p); //public
		System.out.println(act.p2);
	}
}
