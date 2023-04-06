package coding.test.practice;

import java.util.Arrays;

public class NopeEven {
	public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        int[] tmpArr = {};
        
        for (int i = 1; i <= n; i++) { //i가 10보다 같거나 작을때까지
        	if(i%2!=0) {
        		System.out.println(i);
        		count++;
        	}
        }
        answer = new int[count];
        for(int i = 0; i < answer.length; i++) {
        	if(i%2!=0) {
        	}
        }
        
//        for(int i = 1; i <= n; i++) {
//        	tmpArr[i-1] = i; // [ 1, .... , 10]
//        }
//        for(int i = 0; i < n; i++) {
//        	if(tmpArr[i] % 2 != 0) {
//        		answer.
//        	}
//        }
        return answer;
    }
	
	public static void main(String[] args) {
		NopeEven ne=new NopeEven();
		int[] answer=ne.solution(10);
		System.out.println(Arrays.toString(answer));
	}
}
