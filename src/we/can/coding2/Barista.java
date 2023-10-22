package we.can.coding2;

public class Barista extends Employee{

	String name;
	int salary;
	int coffeeTotalNum;
	
	public Barista() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 : 클래스와 동일한 이름을 가지고 있다. 클래스 내부에 존재하는 함수이기 때문에 생성자 또한 메서드이다.
	//1.
	public Barista(String name) { //1번과 2번 모두 파라미터를 받아서 생성하는 생성자 함수이다.
		this.name = name;
	}
	
	//2.
	public Barista(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//메서드 : 클래스 및 객체 내부에 있는 함수
	public void makeCoffee(OrderSheet order) { //메서드는 객체의 행위를 뜻한다.
		if(order.isCompleted == true) { //방어코드
			return;
		}
		
		order.isCompleted = true;
		coffeeTotalNum += order.coffeeNum;
	}
	
	public void showInfo() {
		System.out.println("*** 바리스타 "+name+"이 만든 총 커피의 개수는 "+coffeeTotalNum+"입니다.");
	}
}
