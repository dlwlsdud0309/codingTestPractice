package coding.test.practice;

import java.util.Arrays;

public class AdditionOfFractions {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        if (denom1<denom2 && denom2%denom1==0) {
        	
		}
        
        return answer;
    }
	public static void main(String[] args) {
		AdditionOfFractions aof=new AdditionOfFractions();
		int[] answer=aof.solution(0, 0, 0, 0);
		System.out.println(Arrays.toString(answer));
	}
}
