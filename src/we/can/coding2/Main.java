package we.can.coding2;

public class Main {
	public static void main(String[] args) {
		//name 속성을 설정하는 생성자 함수에 Lee라는 이름을 넣고
		//new 연산자를 통해 바리스타 인스턴스를 생성한 것
		//이와 같은 과정을 '객체 초기화'라고 한다.
		//생성과 동시에 값을 넣어주는 것이다.
		Barista baristaLee = new Barista("Lee"); //baristaLee는 Barista라는 클래스로 만들어지는 인스턴스이기 때문에 타입이 Barista이다.
		baristaLee.showInfo();
		
		Barista baristaKim = new Barista("Kim", 3000);
		
		//파라미터를 받는 생성자 없이 기본 생성자만 사용할 경우
		Barista baristaKim2 = new Barista();
		baristaKim2.name = "Kim2";
		baristaKim2.salary = 5000; //객체를 초기화하는 과정이 오래 걸림
		
//		Barista Kim = new Barista(); //기본생성자가 있어야 생성가능

		//아래의 order와 order2는 확인을 위해 serialNum을 사용하지 않고, 바로 orderNum을 ++증가시켜본 코드이다.
		//참조변수 order와 order2는 서로 다른 주소값을 갖고 있기 때문에 주문서 번호가 1로 동일하게 출력된다.
//		OrderSheet order = new OrderSheet(2);
//		order.showInfo(); //주문서 번호가 1
//		OrderSheet order2 = new OrderSheet(3);
//		order2.showInfo(); //주문서 번호가 1
		
		OrderSheet order = new OrderSheet(5);
		order.showInfo(); //주문서 번호가 102
		OrderSheet order2 = new OrderSheet(6);
		order2.showInfo(); //주문서 번호가 103
		
		Casher casherShin = new Casher("Shin Coding");
		casherShin.makeOrderSheet(7);
		casherShin.showInfo(); //주문서의 개수가 1
		casherShin.makeOrderSheet(3);
		casherShin.showInfo(); //주문서의 개수가 2
		
		baristaKim.makeCoffee(order);
		baristaKim.showInfo(); //커피의 개수가 5
		baristaKim2.makeCoffee(order);
		baristaKim2.showInfo(); //커피의 개수가 0, order은 이미 주문완료(isCompleted=true)되었기 때문
	
		Casher casherKim = new Casher("Kim", 4000);
		casherKim.showSalary(); //4000
//		casherKim.salary = 10; //외부 접근하여 연봉 변경, private로 지정 시 오류
//		casherKim.showSalary(); //10
//		System.out.println(casherKim.salary); //오류, private로 지정했기 때문에 변경도 조회도 할 수 없다.
		//연봉 속성에 바로 접근이 불가하다(private). 연봉을 가져오려면(출력하려면) get함수를 통해야한다.
		int casherKimSalary = casherKim.getSalary();
		System.out.println(casherKimSalary);
		
		casherKim.setSalary(10);
		casherKimSalary = casherKim.getSalary();
		System.out.println(casherKimSalary);
		
	}
}
