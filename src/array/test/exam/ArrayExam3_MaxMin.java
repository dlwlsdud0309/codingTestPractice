package array.test.exam;

public class ArrayExam3_MaxMin {
	public static void main(String[] args) {
		//배열의 활용
		//배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾기
		
		int[] score= {79,88,91,33,100,55,95};
		
		int max=score[0];
		int min=score[0];
		
		for (int i = 1; i < score.length; i++) {
			if (max<score[i]) {
				max=score[i];
			}else if (min>score[i]) {
				min=score[i];
			}
		}
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}
}
