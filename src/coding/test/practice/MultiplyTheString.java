package coding.test.practice;

public class MultiplyTheString {
	//코딩 기초 트레이닝
	//문자열 곱하기
	
	public String solution(String my_string, int k) {
        String answer = "";
		
        for (int i = 0; i < k; i++) {
        	//System.out.print(my_string);
        	answer += my_string;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		MultiplyTheString mts = new MultiplyTheString();
		String result = mts.solution("string", 3);
		System.out.println(result);
	}
	
//	public static void main(String[] args) {
//		String my_string = "love";
//		int k = 10;
//		
//		System.out.print("\"");
//		for (int i = 0; i < k; i++) {
//			System.out.print(my_string);
//		}
//		System.out.print("\"");
//	}
}
