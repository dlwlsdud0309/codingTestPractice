package basic.test.exam;

public class TheStandardOfJava {
	//자바의 정석

	//	System.out.println(); //메소드가 아닌 클래스 영역에 작성하면 오류가 발생한다.
	public void asd() { //임의의 메소드나 main 생성하여 작성해야 오류가 발생하지 않는다.
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println(5/3); //1.666666666666667
		System.out.println(5%3); //2
		System.out.println('A');
		char a = 'A'; //작은따옴표로 문자 하나를 감싼 것 = 문자리터럴
		String b = "AB"; //두 문자 이상은 큰따옴표로 감싸야 하며 이는 문자열 리터럴 이다.
		System.out.println(a);
	}
}
