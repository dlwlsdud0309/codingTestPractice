package array.test.exam;

import java.util.Arrays;

public class ArrayExam2 {
	public static void main(String[] args) {
		//배열선언
		int[] arr= {10,20,30,40,50};
		
		//총점구하기
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		float avg=(float)sum/arr.length;
	
		System.out.println("총점 : "+sum);
		System.out.println("인원수 : "+arr.length);
		System.out.println("평균 : "+avg);
		
		System.out.println("==========구분선==========");
		
		//배열선언
		int[] scores= {80,65,78,98,42};
		
		//총점 구하기
		int sum2=0;
		for (int i = 0; i < scores.length; i++) {
			sum2+=scores[i];
		}
		float avg2=(float)sum2/scores.length; //형변환 해주어야함
		System.out.println("총점2 : "+sum2);
		System.out.println("인원 수2 : "+scores.length);
		System.out.println("평균2 : "+avg2);

		System.out.println("==========구분선==========");
		
		//배열선언
		int[] scores2= {100,200,300,400,555,600,700,800};
		
		int sum3=0;
		for (int i = 0; i < scores2.length; i++) {
			sum3+=scores2[i];
		}
		float avg3=(float)sum3/scores2.length;
		System.out.println("총점3 : "+sum3);
		System.out.println("인원 수3 : "+scores2.length);
		System.out.println("평균3 : "+avg3);
		
		System.out.println("==========구분선==========");
		
		//배열선언
		int[] scores4= {125,251,121,454,777,889};
		
		int sum4=0;
		for (int i = 0; i < scores4.length; i++) {
			sum4+=scores4[i];
		}
		float avg4=(float)sum4/scores4.length;
		
		System.out.println("총점4 : "+sum4);
		System.out.println("인원 수4 : "+scores4.length);
		System.out.println("평균4 : "+avg4);
		
		System.out.println(Arrays.toString(scores4));
	}
}
