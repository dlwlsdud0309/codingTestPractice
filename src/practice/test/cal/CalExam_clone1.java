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
	private JButton[] buttons;
	private String[] button_names= {
			"C","/","*","=","7","8","9",
			"+","4","5","6","-","1","2","3","0"	
		};
	
	public CalExam_clone1() {
		setLayout(null);
		
		setTitle("계산기");
		
		setSize(300, 370);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tField=new JTextField();
		tField.setEditable(false);
		tField.setBackground(Color.white);
		tField.setHorizontalAlignment(JTextField.RIGHT);
		tField.setFont(new Font("Arial",Font.BOLD,50));
		tField.setBounds(8,10,270,70); //x:8, y:10, 270x70
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(0,4,10,10)); //차례대로 가로, 새로, 좌우간격, 상하간격
		panel.setBounds(8, 90, 270, 235);
		
		
		buttons=new JButton[button_names.length];
		int index=0;
		
		for (int i = 0; i < button_names.length; i++) {
			
			buttons[i]=new JButton(button_names[i]);
			buttons[i].setFont(new Font("Arial",Font.BOLD,20));
			
			if(button_names[i]=="C") {
				buttons[i].setBackground(Color.red);
			}else if((i>=4 || i<=6) || (i>=8 || i<=10) || (i>=12 && i<=14)) {
				buttons[i].setBackground(Color.black);
			}else {
				buttons[i].setBackground(Color.gray);
			}
			buttons[i].setForeground(Color.white);
			buttons[i].setBorderPainted(false);
			
			panel.add(buttons[i]);
			index++;
		}
	
		add(tField);
		add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CalExam_clone1();
	}
}
