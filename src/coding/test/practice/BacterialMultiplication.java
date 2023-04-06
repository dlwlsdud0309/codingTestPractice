package coding.test.practice;

public class BacterialMultiplication {
	public int solution(int n, int t) {
        int answer=n;

//        for (int i = 1; i <= t; i++) {
    	for (int i = 0; i < t; i++) {
			answer*=2;
		}
        
        return answer;
    }
	public static void main(String[] args) {
		BacterialMultiplication bm=new BacterialMultiplication();
		int answer=bm.solution(2, 10);
		System.out.println(answer);
	}
}
