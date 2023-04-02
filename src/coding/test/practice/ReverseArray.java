package coding.test.practice;

import java.util.Arrays;

public class ReverseArray {
	public int[] solution(int[] num_list) {
		int[] answer= {};
//		int[] answer= new int [num_list.length];
//		List<int[]> list=Arrays.asList(num_list);
//		Collections.reverse(list);
//		answer=list.toArray(new Integer[list.size()]);
//        int[] answer = new int[num_list.length];
//        for (int i = num_list.length-1; i>=0; i--) {
//        	answer[i]=num_list[i];
//        }
//        System.out.println(Arrays.toString(answer));
		return answer;
    }
	public static void main(String[] args) {
		ReverseArray ra=new ReverseArray();
		int[] num_list= {1, 2, 3, 4, 5};
		int[] answer=ra.solution(num_list);
		System.out.println(Arrays.toString(answer));
	}
}
