package array.test.exam;

public class Chapter5_MaxMin {
	public static void main(String[] args) {
		//배열의 활용(2) - 최대값과 최소값
		int[] score= {79,88,91,33,100,55,95};
		
		int max=score[0]; //배열의 첫 번째 값으로 최대값을 초기화 한다.
		int min=score[0]; //배열의 첫 번째 값으로 최소값을 초기화 한다.
		
		for (int i = 1; i < score.length; i++) {
			//배열의 두 번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화
			if(score[i]>max) {
				max=score[i];
			}else if(score[i]<min) {
				min=score[i];
			}
		}
		//반복문을 통해 배열의 두 번째 요소 'score[1]'부터 max와 비교하기 시작한다.
		//만일 배열에 담긴 값이 max에 저장된 값보다 크다면, 이 값을 max에 저장한다.
		
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}
}
