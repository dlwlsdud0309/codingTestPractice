package coding.test.practice;

public class SumAnEvenNumber {
	int solution(int n) {
		int answer=0;
		
		for (int i = 1; i <= n; i++) {
			if (i%3==0) {
				answer+=i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		SumAnEvenNumber saen=new SumAnEvenNumber();
		int answer=saen.solution(10);
		System.out.println(answer);
	}
}
