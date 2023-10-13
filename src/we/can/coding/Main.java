package we.can.coding;

public class Main {
	public static void main(String[] args) {
		
		Casher casherGu = new Casher("Gu");
		Barista baristaLee = new Barista("Lee");
		
		casherGu.showInfo();
		baristaLee.showInfo();
		System.out.println("===========================");
		OrderSheet order1 = casherGu.makeOrderSheet(4);
		
		order1.showInfo();
		casherGu.showInfo();
		System.out.println("===========================");

		baristaLee.makeCoffee(order1);
		order1.showInfo();
		baristaLee.showInfo();
		
//		System.out.println("이미 완료가 된 주문서를 바리스타에게 넘겼을 경우 : ");
//		baristaLee.makeCoffee(order1);
//		baristaLee.showInfo(); //커피의 잔 수가 증가하지 않은 것을 확인할 수 있음
		
		System.out.println("===========================");
		Casher casherKim = new Casher("Kim", 4000);
		casherKim.showSalary();
//		casherKim.salary = 10; //private가 아닌 default 였을 때는 오류가 나지 않았으나
//		casherKim.showSalary(); //int salary를 private로 지정하면 오류 발생
		
		int casherKimSalary = casherKim.getSalary();
		System.out.println(casherKimSalary);
		
//		Barista baristaGu = new Barista("구슬기");
//		baristaGu.showInfo();
//		
//		Barista baristaKim = new Barista("김연경",300000000);
//		baristaKim.showInfo();
//		
//		//컴퓨터가 자동으로 생성해주는 기본 형태의 생성자만 있다고 가정할 경우
//		//객체를 초기화 하는 과정이 오래 걸린다.
//		Barista baristaChui = new Barista();
//		baristaChui.name = "최";
////		baristaChui.showInfo(); //연봉은 0입니다.
//		baristaChui.salary = 500;
//		baristaChui.showInfo(); //연봉은 500입니다.
//
//		//생성자 함수를 사용하면 한 줄 표현이 가능하다.
//		Barista baristaChui2 = new Barista("최지우",600);
//		baristaChui2.showInfo();
//		
//		
//		System.out.println("========================");
//		OrderSheet test1 = new OrderSheet(4); //커피의 개수 4 = coffeeNum
//		test1.showInfo();
//		
////		System.out.println(Barista.name); //오류
//		System.out.println(baristaGu.name); //구슬기
//		System.out.println(OrderSheet.serialNum); //static serialNum이기 때문에 바로 사용 가능
//	
//		
//		System.out.println("========================");
//		Casher casherShin = new Casher("Shin Coding");
//		casherShin.showInfo();
	}
}
