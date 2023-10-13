package we.can.coding;

//종업원 클래스
//바리스타와 캐셔의 공통점을 뽑아 생성함
public class Employee {

	String name;
	protected int salary; //protected : 같은 클래스, 같은 패키지, 상속 관계의 클래스에서만 접근 가능
	//private는 같은 클래스 내에서만 접근이 가능하기 때문에 속성을 상속시키고 싶다면 사용해선 안된다.
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		if(salary < this.salary) {
			System.out.println("연봉은 깎일 수 없습니다! 연봉을 올려 주지는 못할 망정!");
			return;
		}
		this.salary = salary;
	}
	
	public void showSalary() {
		System.out.println("직원 "+name+"의 연봉은 "+salary+"입니다.");
	}
}
