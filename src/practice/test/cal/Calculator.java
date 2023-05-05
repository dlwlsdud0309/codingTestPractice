package practice.test.cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	//참조 : https://www.youtube.com/watch?v=zFAPpiL17ow&t=17s
	
	private JTextField inputSpace;
	
	public Calculator() {
		setLayout(null); //별다른 레이아웃 관리자를 사용하지 않을 것이므로 기본으로 있는 레이아웃 관리자를 제거
		
		inputSpace=new JTextField();
		inputSpace.setEditable(false); //버튼으로만 입력받도록 편집가능여부는 불가능으로 설정
		inputSpace.setBackground(Color.white);
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
		inputSpace.setBounds(8, 10, 270, 70); //x:8, y:10 위치에 270x70의 크기를 의미함
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4, 10, 10)); //격자형태로 배치해주는 GridLayout 사용, 차례대로 가로, 새로, 좌우간격, 상하간격
		buttonPanel.setBounds(8, 90, 270, 235);
		
		//계산기 버튼의 글자를 차례대로 배열에 저장
		String button_names[]= {
//				"C","÷","×","＝","7","8","9",
//				"＋","4","5","6","－","1","2","3","0"
				"C","/","*","=","7","8","9",
				"+","4","5","6","-","1","2","3","0"
		};
		
		JButton buttons[]=new JButton[button_names.length];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i]=new JButton(button_names[i]);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
		
			//버튼 색 구분
			if(button_names[i]=="C") {
				buttons[i].setBackground(Color.red);
			}else if((i>=4 && i<=6) || (i>=8 && i<=10) || (i>=12 && i<=14)) {
				buttons[i].setBackground(Color.black);
			}else {
				buttons[i].setBackground(Color.gray);
			}
			buttons[i].setForeground(Color.white);
			buttons[i].setBorderPainted(false); //테두리 없애기
			buttonPanel.add(buttons[i]);
		}
		
		add(inputSpace);
		add(buttonPanel);
		
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
