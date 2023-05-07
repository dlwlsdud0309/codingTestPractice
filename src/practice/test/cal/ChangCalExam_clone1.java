package practice.test.cal;

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
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChangCalExam_clone1();
	}
}
