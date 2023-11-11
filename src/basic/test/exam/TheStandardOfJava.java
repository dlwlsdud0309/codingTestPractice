package basic.test.exam;

import java.util.Scanner;

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
		char empty1 = ' '; //공백문자 가능 
//		char empty2 = '';  //에러, 반드시 하나의 문자가 필요
		String emptyStr1 =" "; //공백문자 가능
		String emptyStr2 =""; //내용이 없는 빈 문자열 가능
		String b = "AB"; //두 문자 이상은 큰따옴표로 감싸야 하며 이는 문자열 리터럴 이다.
		System.out.println(a);
		
		String name = new String("Java"); //String 객체를 생성
		String name2 = "Java";
		
		//자료형 -기본형, 참조형
		//기본형 : 문자형, 정수형(byte, short, int, long), 실수형(float, double)
		//		 실제 값을 저장한다.
		//참조형 : 8개의 기본형을 제외한 나머지 타입
		//		 어떤 값이 저장되어 있는 주소(memory address)를 값으로 갖는다.
		
		//자바는 C언어와 달리 참조형 변수 간의 연산을 할 수 없으므로
		//실제 연산에 사용되는 것은 모두 기본형 변수이다.
		
		
		//printf
		int age = 14;
		System.out.printf("age:%d", age);
		System.out.printf("age:%d", 14);
		System.out.printf("age:14");
		
		//출력하려는 값이 2개라면, 지시자도 2개를 사용해야 하며
		//출력될 값과 지시자의 순서가 일치해야 한다
		int year = 2019;
		System.out.printf("age:%d year:%d", age, year);
		System.out.println("==");
		System.out.printf("age:%d%nyear:%d", 14, 2019);
		System.out.println();
		float tmp = 3.456789f; //소수점도 포함
		System.out.printf("tmp=%10.2f", tmp);
		System.out.println();
		
		
		//화면으로부터 입력받기
		//1.Scanner 클래스의 객체 생성
		//2.입력받은 문자열을 변수에 저장
		
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		
//		System.out.println("input : "+input);
//		
//		int num = Integer.parseInt(input);
//		System.out.println("num : "+num);
//		
//		int num2 = scanner.nextInt();
//		System.out.println("num2 : "+num2);
		
		//Math.round
		long result = Math.round(4.52);
		long result2 = Math.round(4.123);
		System.out.println(result+", "+result2);
		
		
	}
}
