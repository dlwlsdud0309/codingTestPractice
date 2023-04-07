package array.test.exam;

public class Chapter5_LengthOfArray {
	public static void main(String[] args) {
		//p.133
		int[] arr=new int[5]; //배열의 길이가 5인 int배열
		int tmp=arr.length; //arr.length의 값은 5이고 tmp에 5가 저장된다.
		
		int[] score=new int[6]; //6을 5로 수정하면 에러가 발생한다.
		for (int i = 0; i < 6; i++) {
			//for문의 조건식에 배열의 길이를 직접 적어주는 것보다 '배열이름.length'를 사용하는 것이 좋다.
			System.out.println(score[i]);
		}
		
		int[] scores=new int[5];
		for (int i = 0; i < scores.length; i++) {
			System.out.println(score[i]);
		}
	}
}
