package coding.test.practice;

import java.util.Arrays;

public class ArrayLength2 {
	 public int[] solution(String[] strlist) {
		 int[] answer= new int [strlist.length];
		 for (int i = 0; i < strlist.length; i++) {
			answer[i]=strlist[i].length();
		}
		 
		 return answer;
	 }
	 public static void main(String[] args) {
		ArrayLength2 al2=new ArrayLength2();
		String[] strlist= {"We", "are", "the", "world!"};
		int[] answer=al2.solution(strlist);
		System.out.println(Arrays.toString(answer));
	}
}
