package coding.test.practice;

public class PizzaSevenSlices {
	public int solution(int n) {
		int answer = 0;

		if (n%7!=0) {
			answer=(n/7)+1;
		}else if(n%7==0) {
			answer=n/7;
		}

		return answer;
	}

	public static void main(String[] args) {
		PizzaSevenSlices pss=new PizzaSevenSlices();
		int answer=pss.solution(35);
		System.out.println(answer);
	}
}
