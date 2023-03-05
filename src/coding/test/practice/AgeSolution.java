package coding.test.practice;

public class AgeSolution {
	public int solution(int age) {
		int answer=0;
		
		int thisYear=2022;
		answer=thisYear-age+1;
		
		
		return answer;
	}
	public static void main(String[] args) {
		//System.out.println("년 기준 "+""+"살 이므로 "+""+"년생입니다.");
		//AgeSolution as=new AgeSolution();
		
		int answer=0;
		int age=0;
		answer=2022-age+1;
		
		System.out.println(answer);
		//int answer=as.solution(5);
	}
}
