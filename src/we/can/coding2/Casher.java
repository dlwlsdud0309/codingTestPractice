package we.can.coding2;

public class Casher extends Employee {
//	String name;
//	private int salary; //private : 같은 클래스에서 사용가능(자기 자신)
	int orderTotalNum;
	
	public Casher(String name) {
		this.name = name;
	}
	
	public Casher(String name, int salay) {
		this.name = name;
		this.salary = salay;
	}
	
	//getter와 setter : 보안성이 높은 속성들을 외부에서 조회하거나 세팅할 때 사용
	//속성변수 salary를 private로 지정하고, 이를 외부에서 가져오고 세팅할 수 있도록 public으로 지정(getter와 setter는 public이어야 한다)
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		if(salary < this.salary) { //this.salary보다 적은 int salary가 들어오면 return을 만나 함수 종료
			System.out.println("연봉은 깎일 수 없습니다! 연봉을 올려 주지는 못할 망정!");
			return;
		}
		this.salary = salary;
	}
	
	//커피가 몇 잔인지 주문을 받고 주문서를 생성하는 메서드
	public OrderSheet makeOrderSheet(int coffeeNum) {//coffeeNum은 커피의 개수
		OrderSheet order = new OrderSheet(coffeeNum);
		orderTotalNum++; //이 캐셔가 총 받은 주문서의 개수를 +1
		return order;
	}
	
	public void showInfo() {
		System.out.println("&&& 캐셔 "+name+"이 처리한 총 주문서의 개수는 "+orderTotalNum+"입니다.");
	}
	
	public void showSalary() { //재정의, 오버라이딩(덮어쓰기)
		System.out.println("&&& 캐셔 "+name+"의 연봉은 "+salary+"입니다.");
	}
}
