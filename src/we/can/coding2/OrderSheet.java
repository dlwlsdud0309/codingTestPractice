package we.can.coding2;

public class OrderSheet {
	static int serialNum = 100; //고유번호
	int orderNum;
	int coffeeNum; //커피의 개수
	boolean isCompleted;
	
	//커피를 한 종류만 파는 카페로 가정하고 종류에 상관없이 주문이 들어온 커피의 개수만을 받음
	public OrderSheet(int coffeeNum) {
		this.coffeeNum = coffeeNum;
		serialNum++; //1증가
		orderNum = serialNum;
		orderNum++;
		isCompleted = false;
	}
	
	public void showInfo() {
		System.out.println("주문서 번호는 "+orderNum+"이고, 커피수는 "+coffeeNum+"이며 완료 여부는 "+isCompleted+"입니다.");
	}
}
