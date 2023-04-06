package coding.test.practice;

public class BacterialMultiplication {
	public int solution(int n, int t) {
        int answer=0;

        for (int i = 1; i <= t; i++) {
			n*=2;
			answer=n;
		}
        
        return answer;
    }
	public static void main(String[] args) {
		BacterialMultiplication bm=new BacterialMultiplication();
		int answer=bm.solution(2, 10);
		System.out.println(answer);
	}
}
