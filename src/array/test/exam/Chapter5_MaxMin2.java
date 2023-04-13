package array.test.exam;

public class Chapter5_MaxMin2 {
	public static void main(String[] args) {
		int[] score= {45,50,70,65,80,90,100};
		
		int max=score[0];
		int min=score[0];
		
		for (int i = 1; i < score.length; i++) {
			if (max<score[i]) {
				max=score[i];
			}else if (min>score[i]) { //else if 사용가능
				min=score[i];
			}
		}
		System.out.println("max : "+max);
//		for (int i = 1; i < score.length; i++) {
//			if (min>score[i]) {
//				min=score[i];
//			}
//		}
		System.out.println("min : "+min);
		
	}
}
