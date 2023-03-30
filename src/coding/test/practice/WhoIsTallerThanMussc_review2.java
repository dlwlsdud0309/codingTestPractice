package coding.test.practice;

public class WhoIsTallerThanMussc_review2 {
	public int solution(int[] array, int height) {
		int answer=0;
		
		for (int i = 0; i < array.length; i++) {
			if(height<array[i]) {
				answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		WhoIsTallerThanMussc_review2 wr=new WhoIsTallerThanMussc_review2();
		
		int array[]= {180,160,175,163,155,192};
		int answer=wr.solution(array, 162);
		
		System.out.println(answer);
	}
}
