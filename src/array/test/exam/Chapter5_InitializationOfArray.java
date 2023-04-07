package array.test.exam;

public class Chapter5_InitializationOfArray {
	public static void main(String[] args) {
		//배열의 초기화 p.134
		//배열은 생성과 동시에 자동적으로 기본값(0)으로 초기화 된다.
		
		int[] score=new int[5]; //길이가 5인 int형 배열 생성
		score[0]=50; //각 요소에 직접 값을 저장
		score[1]=60;
		score[2]=70;
		score[3]=80;
		score[4]=90;
		
		//for문을 이용해서 값을 저장하기
		for (int i = 0; i < score.length; i++) {
			score[i]=i*10+50; //i는 0부터 시작해서 score.legnth인 5미만이므로 0,1,2,3,4이 해당된다
			System.out.println(score[i]);
		}
		
		//배열의 생성과 초기화를 동시에
		int[] scores=new int[]{50,60,70,80,90}; //괄호{} 안의 값의 개수에 의해 배열의 길이가 자동으로 결정되기 때문에 괄호[] 안에 배열의 길이는 생략해도 된다.
		
		//new 타입[]를 생략할 수도 있다.
		int[] score2= {50,60,70,80,90};
	
		//그러나 배열의 선언과 생성을 따로하는 경우에는 생략할 수 없다.
		int[] score3;
		//불가능
//		score3= {50,60,70,80,90}; //new int[]를 생략할 수 없다.
		//가능
		score3= new int[]{50,60,70,80,90};
	}
}
