package coding.test.practice;

public class PizzaSlices {
	public int solution(int slice, int n) {
        int answer = 0;
        if (n%slice!=0) {
			answer=n/slice+1;
		}else if(n%slice==0) {
			answer=n/slice;
		}
        
        return answer;
    }
	public static void main(String[] args) {
		PizzaSlices ps=new PizzaSlices();
		int answer=ps.solution(7, 10);
		System.out.println(answer);
	}
}
