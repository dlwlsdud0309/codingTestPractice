package coding.test.practice;

import java.util.Arrays;

public class ArrayLength {
	public int[] solution(String[] strlist) {
        int[] answer = {};
        answer=new int [strlist.length];
        
        for (int i = 0; i < strlist.length; i++) {
			answer[i]=strlist[i].length();
		}
        
        return answer;
    }
	public static void main(String[] args) {
		ArrayLength al=new ArrayLength();
		String[] strlist= {"We", "are", "the", "world!"};
		int[] answer=al.solution(strlist);
		System.out.println(Arrays.toString(answer));
	}
}
