package coding.test.practice;

public class Solution1 {
	//코딩 기초 트레이닝
	//더 크게 합치기
	public int solution(int a, int b) {
        
        String x = ""+a+b;
        String y = ""+b+a;
        int answer1 = Integer.parseInt(x);
        int answer2 = Integer.parseInt(y);
        
        if(answer1>answer2) {
        	return answer1;
        }else {
        	return answer2;
        }
    }
	
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		int answer = s1.solution(9, 91);
		System.out.println(answer);
	}
}
