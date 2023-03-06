package coding.test.practice;

public class SumAnEvenNumber {
	int solution(int n) {
		int answer=0;
		if (n%2==0) {
			for (n = 2; n <= 1000; n++) {
				answer+=n;
				System.out.println(answer);
			}
		}else {
			System.out.println("홀수입니다");
		}
		
		return answer;
	}
	public static void main(String[] args) {
		SumAnEvenNumber saen=new SumAnEvenNumber();
		int answer=saen.solution(4);
		System.out.println(answer);
	}
}
