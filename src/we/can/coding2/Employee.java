package we.can.coding2;

public class Employee {
	String name;
	protected int salary;
	
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
