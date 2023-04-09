package array.test.exam;

public class Chapter5_SumAvg {
	public static void main(String[] args) {
		//배열의 모든 요소를 더해서 총합과 평균을 구한다.
		
		int sum=0; //총합을 저장하기 위한 변수
		float average=0f; //평균을 저장하기 위한 변수
		//값이 임시로 메모리에 저장될 때 타입이 double이어서 리터럴(데이터) 뒤에 f를 붙여주어야함
		
		int[] score= {100,88,100,100,90};
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i]; //반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.
		}
		
		average=sum/(float)score.length; //계산결과를 float타입으로 얻기 위해 형변환
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+average);
	}
}
