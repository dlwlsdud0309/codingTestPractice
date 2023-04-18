package basic.test.exam;

public class Chapter4_ForExam {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			//1부터 5까지 1씩 증가
			System.out.println("I can do it.");
		}
		
//		for(초기화; 조건식; 증감식){
//					조건식이 참이면, 문장이 증감연산자에 따라 수행되고
//					다시 조건식으로 돌아와 거짓이 될 때까지 반복한다.
//		}
		
		for (int i = 1, j=3, o=5; i <=3; i++, j++, o++) {
			//초기화와 증감식은 2개 이상 사용이 가능하다.
			System.out.println("Hello");
		}
		
		//초기화
//		for (int i = 0, j=0; i <=5, j<=5; i++, j++) {
//									자바는 for문에서 조건식을 2개 이상 쓸 수 없다.	
//		}
	}
}
