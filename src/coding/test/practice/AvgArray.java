package coding.test.practice;

public class AvgArray {
	double solution(int[] numbers) {
		double answer=0;
		double sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
		}
		answer=sum/(numbers.length);
		
		return answer;
	}
	public static void main(String[] args) {
		AvgArray aa=new AvgArray();
		int[] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer=(double) aa.solution(numbers);
		System.out.println(answer);
	}
}
