package coding.test.practice;

import java.util.Arrays;

public class NopeEven {
	public int[] solution(int n) {
        int[] answer = {};
        answer=new int [answer.length];
        
        answer[0]=1;
        for (int i = 0; i < n; i++) {
			if (n%2!=0) {
				answer[i+1]+=n%2;
				System.out.println(answer[i]);
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
