package coding.test.practice;

public class StringReverse {
//	public static void main(String[] args) {
//		String str="ABCDE";
//		
//		String reverse="";
//		for (int i = str.length()-1; i>=0; i--) {
//			reverse=reverse+str.charAt(i);
//			System.out.println(reverse);
//		}
//		
//		System.out.println(reverse);
//	}
	
	public String solution(String my_string) {
        String answer = "";
        for(int i=my_string.length()-1; i>=0; i--){
            answer=answer+my_string.charAt(i);
        }
        return answer;
    }
	public static void main(String[] args) {
		StringReverse sr=new StringReverse();
		String answer=sr.solution("하이");
		System.out.println(answer);
	}
}
