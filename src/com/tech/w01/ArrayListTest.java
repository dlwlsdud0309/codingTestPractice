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
	}
}
