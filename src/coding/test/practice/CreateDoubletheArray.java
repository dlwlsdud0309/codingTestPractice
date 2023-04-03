package coding.test.practice;

import java.util.Arrays;

public class CreateDoubletheArray {
	public int[] solution(int[] numbers) {
//        int[] answer = new int[numbers.length];
		int[] answer= {};
		answer = new int[numbers.length];
		
        for (int i = 0; i < numbers.length; i++) {
			answer[i]=numbers[i]*2;
		}
        return answer;
    }
	public static void main(String[] args) {
		CreateDoubletheArray cdta=new CreateDoubletheArray();
		int[] numbers= {1, 2, 3, 4, 5};
		int[] answer=cdta.solution(numbers);
		System.out.println(Arrays.toString(answer));
	}
}
