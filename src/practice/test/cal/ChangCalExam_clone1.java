package practice.test.cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangCalExam_clone1 extends JFrame{
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] button_names= {
		"C","/","*","=",
		"7","8","9",
		"+",
		"4","5","6",
		"-",
		"1","2","3",
		"0","."
	};
	
	public ChangCalExam_clone1() {
		setLayout(null);
		
		setTitle("계산기");
		setSize(300,370);
		setLocationRelativeTo(null); //실행 시 중앙에 위치
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tField = new JTextField();
		tField.setEditable(false); //입력불가
		tField.setBackground(Color.white); //배경색 white
		tField.setHorizontalAlignment(JTextField.RIGHT); //오른쪽 정렬
		tField.setFont(new Font("Arial",Font.BOLD,50)); //폰트 설정
		tField.setBounds(8, 10, 270, 70); //x:8, y:10, 270x70
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 4, 10, 10)); //가로, 세로, 좌우간격, 상하간격
		panel.setBounds(8, 90, 270, 235);
		
		buttons = new JButton[button_names.length];
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChangCalExam_clone1();
	}
}
