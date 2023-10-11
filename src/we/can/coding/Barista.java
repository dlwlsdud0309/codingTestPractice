package we.can.coding;

public class Barista {
	String name;
	int salary;
	int coffeeTotalNum;
	
	public Barista(String name) {
		this.name = name;
		//this의 경우 파라미터 변수와 속성변수가 동일할 경우 사용한다. 이때 this를 사용하지 않으면 생성자 안에 쓰인 name이 모두 지역변수로 간주된다.
	}
	
	public void makeCoffee(OrderSheet order) {
		if (order.isCompleted == true) {
			return;
		}
		
		order.isCompleted = true;
		coffeeTotalNum += order.coffeeNum;
		
	}
	
	public void showInfo() {
		System.out.println("*** 바리스타 "+name+"가/이 만든 총 커피의 개수는 "+coffeeTotalNum+"입니다.");
	}
}
