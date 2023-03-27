package coding.test.practice;

public class PositionOfADot {
	public int solution(int[] dot) {

		int answer = 0;
//		dot = new int[1]; //왜 여길 살리면 결과가 다르게 나올까?
		
		if (dot[0] < 0 && dot[1] > 0) { //음수, 양수
			answer=2;
		}else if(dot[0]>0 && dot[1]>0) {
			answer=1;
		}else if(dot[0]<0 && dot[1]<0) {
			answer=3;
		}else if(dot[0]>0 && dot[1]<0) {
			answer=4;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		PositionOfADot poad=new PositionOfADot();
		int[] x= {3,-2};
		int answer=0;
		answer=poad.solution(x);
		System.out.println(answer);
	}
}
