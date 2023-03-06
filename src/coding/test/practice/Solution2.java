package coding.test.practice;

public class Solution2 {
	double Solution(double num1, double num2) {
		double answer=num1/num2*1000;
		return answer;
	}
	public static void main(String[] args) {
		Solution2 s2=new Solution2();
		double answer1=s2.Solution(3, 2);
		int answer=(int)answer1;
		System.out.println(answer);
		//문제를 잘 보자!
		//정수만 return이니 Math.round가 아니라 절삭을 해야하는 문제
	}
}
