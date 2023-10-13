package we.can.coding;

public class Barista extends Employee{
	//String name;
	//int salary;
	int coffeeTotalNum; //총 만든 커피의 잔 수
	
	public Barista(String name) {
		this.name = name;
		//this의 경우 파라미터 변수와 속성변수가 동일할 경우 사용한다. 이때 this를 사용하지 않으면 생성자 안에 쓰인 name이 모두 지역변수로 간주된다.
		//파라미터(String n)가 속성인 인스턴스 변수(name)와 다를 경우 name = n;으로 작성이 가능하다.
	}
	
	public Barista(String name, int salary) { //파라미터의 개수가 다를 때
		this.name = name;
		this.salary = salary;
	}
	
	public Barista() {
		//Main.java에서 파라미터가 없는, 즉 기본 생성자를 이용할 경우 명시해주어야한다.
	}
	
	public void makeCoffee(OrderSheet order) { //주문서를 받고 해당 주문서만 처리하는 개념
		if (order.isCompleted == true) { //주문서의 완료 여부가 true이면 이미 완료된 주문 건이므로 함수 종료
			return; //안정성을 증가시키기 위한 '방어코드'
		}
		
		order.isCompleted = true;
		coffeeTotalNum += order.coffeeNum; //coffeeNum : 커피의 개수
		
	}
	
	public void showInfo() {
		System.out.println("*** 바리스타 "+name+"가/이 만든 총 커피의 개수는 "+coffeeTotalNum+"이며 연봉은 "+salary+"입니다.");
	}
	
}
