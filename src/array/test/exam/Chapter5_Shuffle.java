package array.test.exam;

import java.util.Arrays;

public class Chapter5_Shuffle {
	public static void main(String[] args) {
		int[] numArr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < 1; i++) { //1이면 한 번만 반복한다
			int n=(int)(Math.random()*10); //0~9 주으이 한 값을 임의로 얻는다
			int tmp=numArr[0];
			numArr[0]=numArr[n]; //numArr[0]과 numArr[n]의 값을 서로 바꾼다
			numArr[n]=tmp;
		}
		System.out.println(Arrays.toString(numArr));
		
		//배열의 임의의 위치에 있는 값과 배열의 첫 번째 요소 'numArr[0]'의 값을 교환하는 일을 100번 반복해서 배열의 요소가 뒤섞이게 한다
	}
}
