package we.can.coding;

public class Main {
	public static void main(String[] args) {
		Barista baristaGu = new Barista("구슬기");
		baristaGu.showInfo();
		
		Barista baristaKim = new Barista("김연경",300000000);
		baristaKim.showInfo();
		
		//컴퓨터가 자동으로 생성해주는 기본 형태의 생성자만 있다고 가정할 경우
		//객체를 초기화 하는 과정이 오래 걸린다.
		Barista baristaChui = new Barista();
		baristaChui.name = "최";
//		baristaChui.showInfo(); //연봉은 0입니다.
		baristaChui.salary = 500;
		baristaChui.showInfo(); //연봉은 500입니다.

		//생성자 함수를 사용하면 한 줄 표현이 가능하다.
		Barista baristaChui2 = new Barista("최지우",600);
		baristaChui2.showInfo();
	}
}
