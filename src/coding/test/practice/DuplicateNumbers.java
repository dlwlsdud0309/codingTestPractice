package coding.test.practice;

public class DuplicateNumbers {
	//중복된 숫자의 개수
	public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
			if(array[i]==n) {
				answer++;
			}
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		DuplicateNumbers dn = new DuplicateNumbers();
		int[] array = {1,2,3,3,4,5,3};
		int answer = dn.solution(array, 3);
		System.out.println(answer);
	}
}
