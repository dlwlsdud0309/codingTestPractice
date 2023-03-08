package coding.test.practice;

public class LambSkewers {
	public int solution(int n, int k) {
        int answer = 0;
        
        int lambSkewersPrice=12000;
        int drinkPrice=2000;
        int x=n/10;
        
        if (n/10>0) { //n이 10으로 나누어 떨어질 때마다
			answer=n*lambSkewersPrice-(x*drinkPrice)+drinkPrice*k;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		LambSkewers ls=new LambSkewers();
		int answer=ls.solution(10, 3);
		System.out.println(answer);
	}
}
