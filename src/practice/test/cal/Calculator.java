package practice.test.cal;

import javax.swing.JFrame;

public class Calculator extends JFrame{
	
	public Calculator() {
		setTitle("계산기");
		setVisible(true);
		setSize(300,370);
		setLocationRelativeTo(null); //null값으로 지정하여 화면 가운데에 띄우도록
		setResizable(false); //사이즈 조절 불가능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
