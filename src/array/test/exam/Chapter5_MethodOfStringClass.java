package array.test.exam;

public class Chapter5_MethodOfStringClass {
	public static void main(String[] args) {
		//String클래스의 주요 메서드
		
		String str="ABCDE";
		char ch=str.charAt(3);
		System.out.println("charAt : "+ch); //D
		
		String str1="012345";
		String tmp=str1.substring(1, 4);
		System.out.println("substring : "+tmp); //123, index범위 1~4의 문자들을 반환
	}
}
