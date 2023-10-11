package we.can.coding;

public class Main {
	public static void main(String[] args) {
		Barista baristaGu = new Barista("구슬기");
		baristaGu.showInfo();
		
		Barista baristaKim = new Barista("김연경",300000000);
		baristaKim.showInfo();
	}
}
