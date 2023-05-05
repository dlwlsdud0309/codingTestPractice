package practice.test.cal;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	
	private JTextField inputSpace;
	
	public Calculator() {
		setLayout(null); //별다른 레이아웃 관리자를 사용하지 않을 것이므로 기본으로 있는 레이아웃 관리자를 제거
		
		inputSpace=new JTextField();
		inputSpace.setEditable(false); //버튼으로만 입력받도록 편집가능여부는 불가능으로 설정
		inputSpace.setBackground(Color.white);
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
		inputSpace.setBounds(8, 10, 270, 70); //x:8, y:10 위치에 270x70의 크기를 의미함
		
		add(inputSpace);
		
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
