package coding.test.practice;

public class ReturnResultValueAccordingToTheFlag {
	//코딩 기초 테스트
	//flag에 따라 다른 값 반환하기
	
	public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if(flag==true) {
        	answer=a+b;
        }else {
        	answer=a-b;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		ReturnResultValueAccordingToTheFlag rrvattf = new ReturnResultValueAccordingToTheFlag();
		int answer = rrvattf.solution(-4, 7, false);
		System.out.println(answer);
	}
}
