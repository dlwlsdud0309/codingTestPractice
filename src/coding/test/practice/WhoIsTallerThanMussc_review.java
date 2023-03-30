package coding.test.practice;

public class WhoIsTallerThanMussc_review {
	public int solution(int[] array, int height) {
		int answer=0;
		for (int i = 0; i < array.length; i++) {
			if (height<array[i]) {
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		WhoIsTallerThanMussc_review wr=new WhoIsTallerThanMussc_review();
		int[] array= {165,180,100,126,166};
		int answer=wr.solution(array, 165);
		System.out.println(answer);
	}
}
