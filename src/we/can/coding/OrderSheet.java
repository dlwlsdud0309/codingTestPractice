package we.can.coding;

public class OrderSheet {

	static int serialNum = 100; //고유번호
	int orderNum; //주문번호
	public int coffeeNum; //커피의 잔 수
	public boolean isCompleted; //커피가 만들어졌는지에 대한 완료 여부
	
	public OrderSheet(int coffeeNum) { //커피 종류가 하나라는 가정 하에 주문이 들어온 커피의 개수(coffeeNum)만을 받는다
		this.coffeeNum = coffeeNum;
		serialNum++; //static 변수는 인스턴스 생성과 상관이 없으므로 인스턴스 자기 자신을 의미하는 this 키워드를 쓰지 않는다
		orderNum = serialNum; //orderNum : 주문번호
		isCompleted = false; //주문이 막 들어왔을 때이므로 주문서의 완료 여부는 false
	}
	
	public void showInfo() {
		System.out.println("주문서 번호는 "+orderNum+"이고, 커피수는 "+coffeeNum+"이며 완료 여부는 "+isCompleted+"입니다.");
	}
}
