package coding.test.practice;

import java.util.Arrays;

public class ReverseArray2 {
	public int[] solution(int[] num_list) {
//		int[] answer= {};
		int[] answer= new int [num_list.length];
		
		for (int i = 0; i < num_list.length; i++) {
			answer[i]=num_list[i]-i-1;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		ReverseArray2 ra2=new ReverseArray2();
		int[] num_list= {1, 2, 3, 4, 5};
		int[] answer=ra2.solution(num_list);
		System.out.println(Arrays.toString(answer));
	}
}
