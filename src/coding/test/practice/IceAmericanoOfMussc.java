package coding.test.practice;

import java.util.Arrays;

public class IceAmericanoOfMussc {
	public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0]=money/5500;
		answer[1]=money-(answer[0]*5500);
//			if (money%5500==0) {
//				
//			}else if (money-5500!=0) {
//				answer[0]=money/5500;
//				answer[1]=money-(answer[0]*5500);
//		}
        return answer;
    }
	public static void main(String[] args) {
		IceAmericanoOfMussc iaom=new IceAmericanoOfMussc();
		int[] answer=iaom.solution(15000);
		System.out.println(Arrays.toString(answer));
	}
}
