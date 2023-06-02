package coding.test.practice;

import java.util.Arrays;

public class IceAmericanoOfMussc_review {
	public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money-(5500*answer[0]);
        return answer;
    }
	public static void main(String[] args) {
		IceAmericanoOfMussc_review ir = new IceAmericanoOfMussc_review();
		int[] answer = ir.solution(15000);
		System.out.println(Arrays.toString(answer));
	}
}
