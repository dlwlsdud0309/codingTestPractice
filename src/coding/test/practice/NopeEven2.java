package coding.test.practice;

import java.util.Arrays;

public class NopeEven2 {
	public int[] solution(int n) {
        int[] answer = {};
        int j = 0;
        if (n%2==0) {
			answer=new int[n/2];
		}else {
			answer=new int[n/2+1];
		}
        
        for (int i = 1; i <=n; i++) {
        	if(i%2!=0) {
        		answer[j++] = i;
        	}
		}
        
        return answer;
    }
	public static void main(String[] args) {
		NopeEven2 ne=new NopeEven2();
		int[] answer=ne.solution(15);
		System.out.println(Arrays.toString(answer));
	}
}
