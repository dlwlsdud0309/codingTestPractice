package coding.test.practice;

import java.util.Arrays;

public class FindMultiplesOfN {
	public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int j=0;
        for (int i = 0; i < numlist.length; i++) {
        	if (numlist[i]%n==0) {
        		j++;
        		answer=new int[j];
        		System.out.println("numlist[i] : "+numlist[i]);
        		System.out.println(answer.length);
        		System.out.println("answer : "+Arrays.toString(answer));

        		
        	}
//        		numlist=new int[answer.length];
//        		System.out.println(numlist.length);
		}
        for (int i = 0; i < numlist.length; i++) {
        	if (numlist[i]%n==0) {
    			for (int k = 0; k < answer.length; k++) {
					answer[k]=numlist[i];
				}
			}
		}
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		FindMultiplesOfN fmon=new FindMultiplesOfN();
		int[] numlist= {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] answer=fmon.solution(3, numlist);
		System.out.println(Arrays.toString(answer));
	}
}
