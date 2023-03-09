package coding.test.practice;

import java.util.Arrays;

public class MusscOfHeight {
	public int solution(int[] array, int height) {
        int answer = 0;
        array=new int[6];
        
      //  array=new int[3];
        for (int i = 0; i < array.length; i++) {
        	int num=(int)(Math.random()*200)+1;
        	array[i]=num;
        	
			for (int j = 0; j < i; j++) {
				if (array[i]==num) {
					i--;
					break;
				}
			}
        }
        System.out.println(Arrays.toString(array));
        
//        return answer;
        return answer;
    }
	public static void main(String[] args) {
		MusscOfHeight mog=new MusscOfHeight();
		mog.solution(6, 200);
	}
}
