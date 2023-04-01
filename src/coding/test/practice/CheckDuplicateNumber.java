package coding.test.practice;

public class CheckDuplicateNumber {
	public int solution(int[] array, int n) {
        
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (n==array[i]) {
				answer++;
			}
			//else if 사용할 경우
//			else if(n!=array[i]) {
//				answer=0;
//			}
			//n이 1이 아니었을 때, 즉 2,3,4,5는 1이 아니므로
			//값이 0이 되어 원하는 값이 나오지 않는다.
		}
		
        
        return answer;
    }
	
	public static void main(String[] args) {
		CheckDuplicateNumber cdn=new CheckDuplicateNumber();
		int[] array= {1,1,2,3,4,5};
		int answer=cdn.solution(array, 1);
		System.out.println(answer);
	}
}
