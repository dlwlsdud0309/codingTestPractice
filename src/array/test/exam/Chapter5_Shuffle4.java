package array.test.exam;

import java.util.Arrays;

public class Chapter5_Shuffle4 {
	public static void main(String[] args) {
		int[] numArr=new int[10];
		
		//for문 사용하여 배열에 값 넣기
		for (int i = 0; i < numArr.length; i++) {
			numArr[i]=i;
		}
		
		int tmp=0;
		for (int i = 0; i < 2; i++) {
			int n=(int)(Math.random()*10);
			tmp=numArr[0]; //numArr[0]은 0이다, 0이 tmp에 저장된다.
			numArr[0]=numArr[n]; //n의 값이 numArr[0]에 저장된다.
			numArr[n]=tmp; //tmp는 현재 0이다. 0이 numArr[n]에 저장된다.
		}
		System.out.println(Arrays.toString(numArr));
		
	}
}
