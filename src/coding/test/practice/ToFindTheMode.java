package coding.test.practice;

public class ToFindTheMode {
	public int solution(int[] array) {
        int answer = 0;
        answer=array[0];
        for (int i = 0; i < array.length; i++) {
        	if (i<=0) {
				answer=array[i];
			}else if (i>0) { //i가 둘 이상인 경우
				for (int j = 0; j < array.length; j++) {
					if (array[i]==array[j]) {
						answer=array[j];
					}
				}
			}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		ToFindTheMode tftm=new ToFindTheMode();
		int[] array= {1, 2, 3, 3, 3, 4};
		int answer=tftm.solution(array);
		System.out.println(answer);
	}
}
