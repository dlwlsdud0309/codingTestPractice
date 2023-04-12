package array.test.exam;

import java.util.Arrays;

public class Chapter5_Shuffle3 {
	public static void main(String[] args) {
		int[] numArr= {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < 2; i++) {
			int n=(int)(Math.random()*10);
			int tmp=numArr[0];
			numArr[0]=numArr[n];
			numArr[n]=tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}
