package basic.test.exam;

public class Chapter3 {
	public static void main(String[] args) {
		int a = 9;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a+b); //%n은 줄바꾸기
		System.out.printf("%d - %d = %d%n", a, b, a-b);
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d%n", a, b, a/b); //연산결과가 2.5일지라도 int타입의 값인 2를 결과로 얻는다. 반올림도 발생하지 않는다.
		System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);
		//a와 b의 타입이 일치하지 않으므로 int타입보다 범위가 넓은 float타입으로 일치시킨 후 연산을 수행한다.
	}
}
