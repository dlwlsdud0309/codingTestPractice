package coding.test.practice;

public class ALetter {
	public int solution(String message) {
        int answer = 0;

        answer=message.length()*2;
        
        return answer;
    }
	public static void main(String[] args) {
		ALetter al=new ALetter();
		int answer=al.solution("happy birthday!");
		System.out.println(answer);
	}
}
