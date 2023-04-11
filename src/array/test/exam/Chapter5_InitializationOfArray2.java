package array.test.exam;

import java.util.Arrays;

public class Chapter5_InitializationOfArray2 {
	public static void main(String[] args) {
		int[] score=new int[5]; //길이가 5인 int형 배열 생성
		
		//배열의 길이가 큰 경우 for문을 사용하기
		for (int i = 0; i < score.length; i++) {
			score[i]=i*10+50;
		}
		System.out.println(Arrays.toString(score));

		int[] scores=new int[] {50,60,70,80,90}; //배열의 생성과 초기화를 동시에
		//이 경우 new int[]는 생략할 수 있다.
		//하지만 배열의 선언과 생성을 따로 할 경우 new 타입[]는 생략할 수 없다.
	
		int[] score2;
//		score2= {50,60,70,80,90}; //에러
		score2=new int[] {50,60,70,80,90};
	}
}
