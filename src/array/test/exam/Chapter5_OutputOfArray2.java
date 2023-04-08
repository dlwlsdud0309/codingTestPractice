package array.test.exam;

import java.util.Arrays;

public class Chapter5_OutputOfArray2 {
	public static void main(String[] args) {
		//배열의 출력 예제
		int[] iArr1=new int[10];
		int[] iArr2=new int[10];
//		int[] iArr3=new int[] {100,95,80,70,60};
		int[] iArr3= {100,95,80,70,60}; //new int[]를 생략할 수 있음
		char[] chArr= {'a','b','c','d'};
		
//		int[] score;
//		score= {50,60,70,80,90}; //new int[]를 생략할 수 없음
		
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i]=i+1; //1~10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i]=(int)(Math.random()*10)+1; //1~10의 값을 배열에 저장 //랜덤, 중복숫자
		}
		
		//배열에 저장된 값들을 출력한다
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println(iArr1[i]+", ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr)); //[a, b, c, d]
		System.out.println(iArr3); //실행할 때마다 달라질 수 있다
		System.out.println(chArr); //abcd
	}
}
