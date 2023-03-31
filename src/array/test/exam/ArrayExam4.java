package array.test.exam;

public class ArrayExam4 {
	public static void main(String[] args) {
		int[] score= {100,58,16,213,555};
		
		int max=score[0];
		int min=score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {
				max=score[i];
			}else if(min>score[i]) {
				min=score[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
}
