package coding.test.practice;

public class Solution3 {
//	짝수 홀수 개수.. 그러나 구하지 못했다
	public int[] solution(int[] num_list) {
		
		//num_list=new int[] {1,2,3,4,5};
		int[] answer = new int[1];
//		int answer1=0;
		
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i]%2==0) {
				answer[0]=num_list.length;
				System.out.println(answer[0]);
			}if(num_list[i]%3==0) {
				answer[1]=num_list.length;
				System.out.println(answer[1]);
			}
			//answer1=(num_list[i]%2==0 ? answer[0]=num_list.length:answer[1]=num_list.length);
		}
		
		
        
        return answer;
    }
	public static void main(String[] args) {
		Solution3 s3=new Solution3();
		int[] num_list=new int[] {1,2,3,4,5};
//		s3.solution(num_list);
		
		int answer[];
		answer=s3.solution(num_list);
		System.out.println("0"+answer[0]);
		System.out.println("1"+answer[1]);
	}
}
