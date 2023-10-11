package we.can.coding;

public class OrderSheet {

	static int serialNum = 100; //고유번호
	int orderNum; //주문번호
	public int coffeeNum; //커피의 잔 수
	public boolean isCompleted; //커피가 만들어졌는지에 대한 완료 여부
	
	public OrderSheet(int coffeeNum) {
		this.coffeeNum = coffeeNum;
		serialNum++;
		orderNum = serialNum;
		isCompleted = false;
	}
	
	public void showInfo() {
		System.out.println("주문서 번호는 "+orderNum+"이고, 커피수는 "+coffeeNum+"이며 완료 여부는 "+isCompleted+"입니다.");
	}
}
