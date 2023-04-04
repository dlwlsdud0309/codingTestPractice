package coding.test.practice;

import java.util.Arrays;

public class EvenAndOdd {
	public int[] solution(int[] num_list) {
        int[] answer = {};
        answer=new int[2];
        
//        int even=0;
//        int odd=0;
        
        for (int i = 0; i < num_list.length; i++) {
			if (num_list[i]%2==0) {
//				even++;
				answer[0]++;
			}else{
//				odd++;
				answer[1]++;
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		EvenAndOdd eao=new EvenAndOdd();
		int[] num_list= {1, 2, 3, 4, 5};
		int[] answer=eao.solution(num_list);
		System.out.println(Arrays.toString(answer));
	}
}
