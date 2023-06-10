package coding.test.practice;

public class MultipleOfN {
	//코딩 기초 트레이닝
	//n의 배수
	public int solution(int num, int n) {
        int answer = 0;
     
        if(num%n==0) {
        	answer=1;
        }else {
        	answer=0;
        }
        
        return answer;
    }
}
