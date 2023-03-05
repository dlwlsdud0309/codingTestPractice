package coding.test.practice;

public class CompareNumber {
	public int solution(int num1, int num2) {
		int answer = 0;
		if (num1==num2) {
			answer = 1;
		}else {
			answer = -1;
		}
		return answer;
	}
	
	//삼항연산자 사용
	public int ternaryOperators(int num1, int num2) {
		int answer=(num1==num2)?1:-1;
		return answer;
	}
	
	public static void main(String[] args) {
		CompareNumber cn=new CompareNumber();
		int answer1=cn.solution(5, 5);
		System.out.println("숫자 비교하기 : "+answer1);
	
		int answer2=cn.ternaryOperators(5, 6);
		System.out.println("삼항연산자 사용 : "+answer2);
	}
}
