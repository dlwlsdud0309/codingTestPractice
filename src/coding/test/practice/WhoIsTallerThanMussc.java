package coding.test.practice;

public class WhoIsTallerThanMussc {
	public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
        	if (height<array[i]) {
        		answer++;
			}
		}
        return answer;
    }
	
	public static void main(String[] args) {
		
		WhoIsTallerThanMussc wittm=new WhoIsTallerThanMussc();
		int[] array= {180,120,166,65};
		int array2=wittm.solution(array, 165);
		System.out.println(array2);
	}
}
