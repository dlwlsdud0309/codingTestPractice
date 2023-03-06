package coding.test.practice;

public class Protractor {
	int solution(int angle) {
	//	angle=0;
		int answer=0;
		//if(answer!=0) {
			if (0<angle && angle<90) {
				answer=1;
			}else if(angle==90) {
				answer=2;
			}else if(90<angle && angle<180) {
				answer=3;
			}else {
				answer=4;
			}
		//}
		//System.out.println(answer);
		return answer;
	}
		
	public static void main(String[] args) {
		Protractor pt=new Protractor();
		int answer=pt.solution(91);
		System.out.println(answer);
	}
		
			
}
