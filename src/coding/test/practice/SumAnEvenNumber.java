package coding.test.practice;

public class SumAnEvenNumber {
	int solution(int n) {
		int answer=0;
		
		for (int i = 1; i <= n; i++) {
			if (n%2==0) {
				answer+=n;
			}else {
				System.out.println("홀수입니다");
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		SumAnEvenNumber saen=new SumAnEvenNumber();
		int answer=saen.solution(6);
		System.out.println(answer);
	}
}
