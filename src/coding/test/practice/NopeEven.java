package coding.test.practice;

import java.util.Arrays;

public class NopeEven {
	public int[] solution(int n) {
        int[] answer = {};
        answer=new int [answer.length];
        
        int tmp=1;
		for (int i = 0; i <= n; i++) {
			if (n%2!=0) {
				tmp+=2;
				answer[i]=tmp;
				
				System.out.println(Arrays.toString(answer));
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
