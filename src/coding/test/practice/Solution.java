package coding.test.practice;

public class Solution {
	public int soulution(int num1, int num2) {
		int answer=num1*num2;
		return answer;
	}
	public int divide(int num1, int num2) {
		int answer=num1%num2;
		return answer;
	}
	int subtraction(int num1, int num2) {
		int answer=num1-num2;
		return answer;
	}

	public static void main(String[] args) {
		Solution sol=new Solution();
		int answer1=sol.soulution(3, 7);
		System.out.println("정답1 : "+answer1);
		
		int answer2=sol.divide(3, 2);
		System.out.println("정답2 : "+answer2);
		
		int answer3=sol.subtraction(5, 3);
		System.out.println("정답3 : "+answer3);
	}
}
