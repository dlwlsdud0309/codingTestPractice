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
	}
}
