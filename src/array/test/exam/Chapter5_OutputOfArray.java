package array.test.exam;

public class Chapter5_OutputOfArray {
	public static void main(String[] args) {
		//배열에 저장된 값을 확인할 때도 for문을 사용하면 된다.
		int[] iArr= {100,95,80,70,60};
		for (int i = 0; i < iArr.length; i++) {
//			System.out.println(iArr[i]);
			System.out.print(iArr[i]+", ");
		}
		System.out.println();
		
		System.out.println("=========================");
		
		//char배열은 println메서드로 출력하면 각 요소가 구분자 없이 그대로 출력된다.
		//char배열만 그러하다.
		char[] chArr= {'a','b','c','d'};
		System.out.println(chArr); //abcd 확인
	}
}
