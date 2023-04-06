package coding.test.practice;

public class AdditionOfCiphers {
	public int solution(int n) {
        int answer = 0;
        String nstr = String.valueOf(n);
        String array []= nstr.split("");
        for (int i = 0; i < array.length; i++) {
			answer+=Integer.parseInt(array[i]);
		}
        return answer;
    }
	public static void main(String[] args) {
		AdditionOfCiphers aoc=new AdditionOfCiphers();
		int answer=aoc.solution(1234);
		System.out.println(answer);
	}
}
