package com.tech.w01;

import java.util.ArrayList;

public class ArrayListMission {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> indexlist = new ArrayList<Integer>();
		
		list.add("길동1");
		list.add("길동2");
		list.add("길동1");
		list.add("길동3");
		list.add("길동1");
		list.add("길동1");
		list.add("길동4");
		list.add("길동1");
		
//		for (String ele : list) {
//			System.out.print(ele+" ");
//		}
		list.remove(list.indexOf("길동4"));
		
		int num = 0;
		for (String ele : list) {
			if(ele=="길동1") { //list에 담긴 값이 길동1이면
				indexlist.add(num);
				System.out.println("@@@num : "+num);
			}
			num++;
		}
		
		System.out.println();
		for (Integer n : indexlist) {
			System.out.print(n+" ");
		}
//		num++;
		
		int start = indexlist.size()-1;
		for (int i = start; i >= 0; i--) {
			list.remove((int)indexlist.get(i));
		}
		System.out.println();
		
		System.out.println();
		for (String ele : list) {
			System.out.print(ele+" ");
		}
	}
}
