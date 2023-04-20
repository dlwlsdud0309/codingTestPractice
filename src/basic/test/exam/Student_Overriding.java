package basic.test.exam;

public class Student_Overriding extends Human_Overriding{ //자식클래스
	String school;
	
	public void who() {
		System.out.println("이 사람의 이름은 "+name+"이고 학교는 "+school+"학교에 다닙니다.");
	}
	
	//같은 이름의 메서드 이지만 상위클래스의 메서드를 하위클래스에서 다시 덮어쓰는 방식을
	//overriding이라고 한다.
}
