package practice.test.cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeCalExam_clone3 extends JFrame{
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
	
	public ChangeCalExam_clone3() {
		setLayout(null);
		
		setTitle("계산기");
		setSize(300,370);
		setLocationRelativeTo(null); //실행 시 중앙에 위치
		setResizable(false); //크기 조정 불가능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JTextField
		tField = new JTextField();
		tField.setEditable(false);
		tField.setBackground(Color.white);
		tField.setHorizontalAlignment(JTextField.RIGHT);
		tField.setFont(new Font("Arial",Font.BOLD,50));
		tField.setBounds(8,10,270,70); //x:8(오른쪽으로 이동), y:10(아래로 이동), 270(길이, 오른쪽으로 길어짐), 70(아래로 길어짐)
		
		add(tField);
		
		//JPanel
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,4,10,10)); //가로, 세로, 좌우간격, 상하간격
		panel.setBounds(8, 9, 270, 235);
		
		add(panel);
		
		//반복문 사용하여 버튼 부착
		for (int i = 0; i < button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChangeCalExam_clone3();
	}
}
