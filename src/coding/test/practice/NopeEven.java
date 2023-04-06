package coding.test.practice;

import java.util.Arrays;

public class NopeEven {
	public int[] solution(int n) {
        int[] answer = {};
        
        if (n%2!=0) {
			for (int i = 0; i < answer.length; i++) {
				if (n<answer[i]) {
					answer[i]=n;
				}
			}
		}
        
        return answer;
    }
	public static void main(String[] args) {
		NopeEven ne=new NopeEven();
		int[] answer=ne.solution(10);
		System.out.println(Arrays.toString(answer));
	}
}
