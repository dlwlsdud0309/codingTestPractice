package array.test.exam;

public class Chapter5_MainMethodOfStringClass3 {
	public static void main(String[] args) {
		String str="2023년 04월 18일";
		char ch=str.charAt(4);
		System.out.println("ch : "+ch);
	
		String substr=str.substring(3, 9);
		System.out.println("substr : "+substr);
	}
}
