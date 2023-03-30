package coding.test.practice;

import java.util.Arrays;
import java.util.Collections;

public class WhoIsTallerThanMussc {
	public int solution(int[] array, int height) {
        int answer = 0;
//        array= new int[] {180,120,65};
        for (int i = 0; i < array.length; i++) {
//			if(height<array[i]) {
////				answer=Collections.frequency(Arrays.asList(array), height<array[i]);
//				answer=array.length;
//			}
		}
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
//		int answer = 0;
//        int[] array= new int[] {180,120,65};
//        int height=165;
//        for (int i = 0; i < array.length; i++) {
//			if(height<array[i]) {
//				answer=Collections.frequency(Arrays.asList(array), height<array[i]);
//			}
//		}
//        System.out.println(answer);
//        return answer;
		
		WhoIsTallerThanMussc wittm=new WhoIsTallerThanMussc();
		int[] array= {180,120,65};
		int array2=wittm.solution(array, 165);
		System.out.println(array2);
	}
}
