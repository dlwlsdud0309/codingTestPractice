package coding.test.practice;

public class CheckDuplicateNumber {
	public int solution(int[] array, int n) {
        
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (n==array[i]) {
				answer++;
			}
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
