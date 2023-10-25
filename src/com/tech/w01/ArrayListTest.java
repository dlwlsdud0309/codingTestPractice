package com.tech.w01;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> zoo= new ArrayList<String>();
		zoo.add("elephant"); //코끼리
		zoo.add("lion");
		zoo.add("giraffe"); //기린
		zoo.add("crocodile"); //악어
		zoo.add("squirrel"); //다람쥐
		
		System.out.println("길이 출력 : "+zoo.size());
		
		for (String zVal : zoo) {
			System.out.println(zVal);
		}
		
		zoo.remove(0);
		System.out.println("@@@ remove 사용하여 인덱스 0번 삭제");
		for (String zVal : zoo) {
			System.out.println(zVal); //elephant 삭제됨
		}
		
		zoo.remove("lion");
		System.out.println("@@@ remove 사용하여 문자로 직접 삭제");
		for (String zVal : zoo) {
			System.out.println(zVal); //lion 삭제됨
		}
		
		System.out.println("@@@ add 사용하여 문자로 직접 추가");
		zoo.add("lion2");
		for (String zVal : zoo) {
			System.out.println(zVal);
		}
		
		System.out.println("@@@ add 사용하여 인덱스로 위치 지정 후 추가");
		zoo.add(0, "lion3");
		for (String zVal : zoo) {
			System.out.println(zVal);
		}
		
		System.out.println("검색 : "+zoo.get(3)); //squirrel
		
//		zoo.remove(zoo.indexOf(zoo));
		for (String zVal : zoo) {
			System.out.println(zVal);
		}
		
		System.out.println("indexOf로 lion3 삭제");
		zoo.remove(zoo.indexOf("lion3"));
		for (String zVal : zoo) {
			System.out.println(zVal);
		}
		
		//lion을 두 번 추가 후 remove를 사용하면 개별로 삭제된다(indexOf도 마찬가지).
		zoo.add("lion");
		zoo.add("lion");
		for (String zVal : zoo) {
			System.out.println(zVal);
		}
		zoo.remove("lion");
		for (String zVal : zoo) {
			System.out.println(zVal);
		}
		zoo.remove("lion");
		for (String zVal : zoo) {
			System.out.println(zVal);
		}
		
		//
//		System.out.println("lion 두번 추가");
//		zoo.add("lion");
//		zoo.add("lion");
//		for (String zVal : zoo) {
//			System.out.println(zVal);
//		}
//		System.out.println("lion indexOf로 삭제");
//		zoo.remove(zoo.indexOf("lion"));
//		zoo.remove(zoo.indexOf("lion"));
//		for (String zVal : zoo) {
//			System.out.println(zVal);
//		}
	}
}
