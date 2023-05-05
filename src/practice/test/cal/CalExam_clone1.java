package practice.test.cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalExam_clone1 extends JFrame{

	private JPanel panel;
	private JTextField tField;
	
	public CalExam_clone1() {
//		setLayout(null);
		
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 370);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);

		tField=new JTextField();
		tField.setEditable(false);
		tField.setBackground(Color.white);
		tField.setHorizontalAlignment(JTextField.RIGHT);
		tField.setFont(new Font("Arial",Font.BOLD,50));
		tField.setBounds(8,10,270,70); //x:8, y:10, 270x70
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		
		JPanel panelA=new JPanel();
		JPanel panelB=new JPanel();
		
		panelB.setLayout(new GridLayout(0,4,10,10)); //차례대로 가로, 새로, 좌우간격, 상하간격
		panelB.setBounds(8, 90, 270, 235);
		
		String[] button_names= {
				"C","/","*","=","7","8","9",
				"+","4","5","6","-","1","2","3","0"	
			};
		JButton[] buttons=new JButton[button_names.length];
	
	
		add("North",tField);
		add("Center",panel);
	}
	
	public static void main(String[] args) {
		new CalExam_clone1();
	}
}
