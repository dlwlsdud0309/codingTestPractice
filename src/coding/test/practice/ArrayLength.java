package coding.test.practice;

import java.util.Arrays;

public class ArrayLength {
	public int[] solution(String[] strlist) {
        int[] answer = {};
//        strlist= new String[] {"We", "are", "the", "world!"};
        
//        for (int i = 0; i < strlist.length; i++) {
//			answer[i]=strlist[i].length();
//		}
        
        for (String str : strlist) {
			for (int i = 0; i < answer.length; i++) {
				answer[i]=str.length();
				System.out.println(answer[i]);
			}
		}
			
//        System.out.println(answer);
        
        return answer;
    }
	public static void main(String[] args) {
		ArrayLength al=new ArrayLength();
		String[] strlist= {"We", "are", "the", "world!"};
		int[] answer=al.solution(strlist);
		System.out.println(Arrays.toString(answer));
	}
}
