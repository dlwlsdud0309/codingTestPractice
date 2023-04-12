package array.test.exam;

public class Chapter5_InitializationOfStringArray {
	public static void main(String[] args) {
		//String배열의 초기화
		//p.142
		String[] name=new String[3];
		name[0]="Kim"; //특별히 String클래스만 큰따옴표만으로 간략히 표현하는 것이 허용된다
//		name[0]=new String("Kim"); //원래는 이렇게 new연산자를 통하여 객체를 생성해야 한다.
		name[1]="Park";
		name[2]="Yi";
		
		//괄호를 사용하여 간단히 초기화하기
		String[] name2=new String[] {"Kim", "Park", "Yi"};
		String[] name3= {"Kim", "Park", "Yi"};
		
//		==========================================================
		System.out.println("====== String배열의 초기화 ======");
		char[] charArr=new char[3];
		charArr[0]='a'; //큰 따옴표는 아니나 p.135에서 확인된 내용처럼 가볍게 참고하기
		charArr[1]='b';
		charArr[2]='c';
		System.out.println(charArr);
		System.out.println("====== char배열 확인, 가볍게 참고하기 ======");
//		==========================================================
	
		String[] names= {"Kim", "Park", "Yi"};
		for (int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"] : "+names[i]);
		}
		
		String tmp=names[2]; //배열 names의 세번째 요소(names[0],names[1],names[2])를 tmp에 저장
		System.out.println("tmp : "+tmp);
//		names[0]="Yu"; //배열 names의 첫 번째 요소를 "Yu"로 변경
		names[0]=new String("Yuuu"); //이렇게도 가능하다
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
