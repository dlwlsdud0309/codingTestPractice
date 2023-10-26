package array.test.exam;

public class CreateAMaximumValue {
	//최댓값 만들기1
	public int solution(int[] numbers) {
        int answer = 0;

        int max1 = numbers[0];
        int max2 = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
        	
        	if(max1<numbers[i]) {
        		max1 = numbers[i];
        	}else {
        		max2 = numbers[i];
        	}
		}
        System.out.println(max1);
        System.out.println(max2);
//        answer = max1*max2;
        return answer;
    }
	
	public static void main(String[] args) {
		CreateAMaximumValue camv = new CreateAMaximumValue();
		int[] numbers = {0,31,24,10,1,9};
		int answer = camv.solution(numbers);
//		System.out.println(answer);
	}
}
