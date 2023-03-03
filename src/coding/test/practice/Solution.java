package coding.test.practice;

public class Solution {
	public int soulution(int num1, int num2) {
		int answer=num1*num2;
		return answer;
	}
	public static void main(String[] args) {
		Solution sol=new Solution();
		int answer=sol.soulution(3, 7);
		System.out.println("정답 : "+answer);
	}
}
