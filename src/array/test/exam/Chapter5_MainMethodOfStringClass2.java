package array.test.exam;

public class Chapter5_MainMethodOfStringClass2 {
	public static void main(String[] args) {
		//String클래스의 주요 메서드
		//p.144
		//복습

		//charAt메서드는 문자열에서 지정된 index에 있는 한 문자를 가져온다
		String str="동해물과 백두산이 마르고 닳도록";
		char ch=str.charAt(3);
		System.out.println(ch); //과
		
		//substring()은 문자열의 일부를 뽑아낼 수 있다
		//주의할 점은, 범위의 끝은 포함되지 않는다.
		String str2="012345";
		String tmp=str2.substring(1, 4);
		System.out.println(tmp); //index4에 해당하는 4를 제외한 123만 출력되었음을 확인 
	}
}
