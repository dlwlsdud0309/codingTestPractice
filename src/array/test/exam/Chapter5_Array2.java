package array.test.exam;

public class Chapter5_Array2 {
	public static void main(String[] args) {
		//자바의 정석 p.131
		
		//배열 선언
		//타입[] 변수이름;
		int[] score;
		
		//배열을 선언한 뒤에는 배열을 생성해야한다.
		//배열을 선언하는 것은 단지 생성된 배열을 다루기 위한 참조변수를 위한 공간이 만들어질 뿐이고,
		//배열을 생성해야만 비로소 값을 저장할 수 있는 공간이 만들어지는 것이다.
		//배열을 생성하기 위해서는 연산자 'new'와 함께 배열의 타입과 길이를 지정해주어야한다.
		
		int[] scores, testArray, testArray2; //참조변수 scores 선언
		scores= new int[5]; //배열을 생성(실제 저장공간을 생성), int 타입의 값 5개를 저장할 수 있다.
		testArray = new int[3];
		testArray2 = new int[6];
		System.out.println(testArray.length);
		System.out.println(testArray2.length);
		
		//배열의 선언과 생성을 따로하는 경우에는 생략할 수 없다.
		//Chapter5_InitializationOfArray 참고
		scores = new int[] {1,2,3,4,5};
		testArray = new int[] {1,2}; //??
		System.out.println(testArray.length);
		
		testArray2= new int[] {1,2,3,4,5};
		System.out.println(testArray2.length);
		
		//간략히 한줄로 배열의 선언과 생성 하기
		int[] socre2=new int[5];
		
		//==========================================================
		//p.132
		//생성된 배열의 각 저장공간을 '배열의 요소'라고 하며, '배열이름[인덱스]의 형식으로 배열의 요소에 접근한다.
		
		//"인덱스(index)의 범위는 0부터 '배열길이-1'까지" ★★★★★
		
		//배열의 길이가 5인 배열은 모두 5개의 요소(저장공간)을 가지며 인덱스의 범위는 0부터 4까지이다.
		//배열에 값을 저장하고 읽어올 때 '배열이름[인덱스]'를 사용한다.
		
		
	}
}
