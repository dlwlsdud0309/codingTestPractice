package coding.test.practice;

public class CommonMultiple {
	//코딩 기초 트레이닝
	//공배수
	public int solution(int number, int n, int m) {
        int answer = 0;
        
        if(number%n==0 && number%m==0) {
        	return answer=1;
        }else {
        	return answer=0;
        }
        
    }
	
	public static void main(String[] args) {
		CommonMultiple cm = new CommonMultiple();
		int answer = cm.solution(60, 2, 3);
		System.out.println(answer);
	}
}
