package array.test.exam;

public class Chapter5_StringClass {
	public static void main(String[] args) {
		//String클래스
		//p.143
		
		//String클래스는 char배열에 기능(메서드)를 추가한 것이다.
		//char배열과 String클래스의 중요한 차이는 String객체(문자열)는 읽을 수만 있을 뿐 내용을 변경할 수는 없다.
		
		String str="Java";
		str=str+"8"; //Java8이라는 새로운 문자열이 str에 저장된다
		System.out.println(str);
		
		str=str+9;
		System.out.println(str); //Java89
		//위의 문장에서 문자열 str의 내용이 변경된 것 같지만, 문자열은 변경할 수 없으므로 새로운 내용의 문자열이 생성된다.
		//변경 가능한 문자열을 다루려면 StringBuffer클래스를 사용하면 된다.
	}
}
