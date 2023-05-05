package practice.test.cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_shape_clone2 extends JFrame{
	
	private JTextField inputSpace;
	
	public Calculator_shape_clone2() {
		//배치관리자를 제거, 절대위치를 지정해주어야함
		setLayout(null);
		
		//JTextField
		inputSpace=new JTextField();
		inputSpace.setEditable(false);
		inputSpace.setBackground(Color.white);
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		inputSpace.setFont(new Font("Arial",Font.BOLD,50));
		inputSpace.setBounds(8,10,270,70); //x:8, y:10, 270x70
		
		//버튼을 부착할 판넬 설정
		JPanel buttonPanel=new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4, 10, 10)); //가로, 세로, 좌우간격, 상하간격
		buttonPanel.setBounds(8, 90, 270, 235);
		
		//간략히 한줄로 배열의 선언과 생성 하기
//				int[] socre2=new int[5];
		
		//버튼생성
		String button_names[]= {
				"C","/","*","=",
				"7","8","9", //index 4,5,6
				"+",
				"4","5","6", //index 8,9,10
				"-",
				"1","2","3", //index 12,13,14
				"0" 
		};
		JButton buttons[]=new JButton[button_names.length];
		
		//반복문 사용하여 버튼 폰트, 색 지정 후 부착
		for (int i = 0; i < button_names.length; i++) {
			buttons[i]=new JButton(button_names[i]);
			buttons[i].setFont(new Font("Arial",Font.BOLD,20));
		
			if (button_names[i]=="C") {
				buttons[i].setBackground(Color.red); //C버튼의 배경색은 red
			}else if((i>=4 && i<=6) || (i>=8 && i<=10) || (i>=12 && i<=14)) {
				buttons[i].setBackground(Color.black);
			}else {
				buttons[i].setBackground(Color.gray);
			}
			
			buttons[i].setForeground(Color.white); //글자색 변경
			buttons[i].setBorderPainted(false);
			buttonPanel.add(buttons[i]);
		}
		
		add(inputSpace);
		add(buttonPanel);
		
		//JFrame
		setTitle("계산기");
		setVisible(true);
		setSize(300, 370);
		setLocationRelativeTo(null); //실행 시 중앙에 위치
		setResizable(false); //사이즈 조절 불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator_shape_clone2();
	}
}
