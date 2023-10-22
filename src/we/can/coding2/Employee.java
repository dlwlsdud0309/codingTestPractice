package we.can.coding2;

public class Employee {
	//상속이란, 기존에 있던 클래스의 데이터를 물려받아서 새로운 클래스를 만드는 것
	//잘 만들어진 기능을 가져와서 사용하기도 하고 내가 필요한 기능도 추가해서 사용할 수 있다.
	//기존의 클래스를 확장시킨다는 뜻을 가지고 있다.
	String name;
	protected int salary; //'상속'을 위해서는 private가 아닌 protected를 사용해야한다.
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		if(salary < this.salary) {
			System.out.println("연봉은 깎일 수 없습니다! 연봉을 올려주지는 못할 망정!");
			return;
		}
		this.salary = salary;
	}
	
	public void showSalary() {
		System.out.println("직원 "+name+"의 연봉은 "+salary+"입니다.");
	}
}
