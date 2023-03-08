package coding.test.practice;

public class LambSkewers {
	public int solution(int n, int k) {
        int answer = 0;
        
        int lambSkewers=0;
        int lambSkewersPrice=12000;
//        int drink=0;
        int drinkPrice=2000;
        
     //   if (n%10==0) { //n이 10으로 나누어 떨어질 때마다
			answer=n*lambSkewersPrice-(lambSkewers*drinkPrice)+drinkPrice*k;
			System.out.println(answer);
     //   }
        
        return answer;
    }
	
	public static void main(String[] args) {
		LambSkewers ls=new LambSkewers();
		int answer=ls.solution(64, 6);
		System.out.println(answer);
	}
}
