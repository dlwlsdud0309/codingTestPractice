package we.can.coding;

public class Casher {
	//속성
	String name; //이름
	int salary; //연봉
	int orderTotalNum; //총 만든 주문서의 개수
	
	public Casher(String name) { //생성자
		this.name = name;
	}
	
	public Casher(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//커피가 몇 잔인지 주문을 받고 주문서를 생성하는 메서드
	public OrderSheet makeOrderSheet(int coffeeNum) { //coffeeNum : 커피의 개수
		
		OrderSheet order = new OrderSheet(coffeeNum); //주문받은 커피의 개수를 받아 주문서 생성
		orderTotalNum++;
		return order;
	}
	
	//메서드
	public void showInfo() {
		System.out.println("&&& 캐셔 "+name+"이 처리한 총 주문서의 개수는 "+orderTotalNum+"입니다.");
	}
	
	//연봉을 보여주는 메서드
	public void showSalary() {
		System.out.println("&&& 캐셔 "+name+"의 연봉은 "+salary+"입니다.");
	}
}
