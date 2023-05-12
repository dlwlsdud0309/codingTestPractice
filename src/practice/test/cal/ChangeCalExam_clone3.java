package practice.test.cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeCalExam_clone3 extends JFrame implements ActionListener{
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
		panel.setBounds(8, 90, 270, 235);
//		panel.setBackground(Color.cyan);
		
		add(panel);
		
		
		//JButton, 길이지정
		//int[] score;
		//score = new int[length];
		buttons = new JButton[button_names.length]; //private JButton[] buttons;
		
		//반복문 사용하여 버튼 부착
		for (int i = 0; i < button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			buttons[i].addActionListener(this);
			buttons[i].setFont(new Font("Arial",Font.BOLD,20));
			
			//버튼에 색 지정
			if (button_names[i]=="C") {
				tField.setText("0.0");
				buttons[i].setBackground(Color.red);
			}else if((i>=4 && i<=6) || (i>=8 && i<=10) || (i>=12 && i<=14)) {
				buttons[i].setBackground(Color.black);
			}else {
				buttons[i].setBackground(Color.gray);
			}
			buttons[i].setForeground(Color.white);
			buttons[i].setBorderPainted(false);
			panel.add(buttons[i]);
		}
		setVisible(true);
	}
	
	private double result = 0;
	private String operator = "=";
	private boolean startNumber = true;
	
	
	public static void main(String[] args) {
		new ChangeCalExam_clone3();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if(command.equals("C")) {
			startNumber = true;
			result = 0;
			operator = "=";
			tField.setText("0.0");
		}else if(command.charAt(0)>='0' && command.charAt(0)<='9' || command.equals(".")) {
			if(startNumber==true) { //'='일 경우 일의 자리 이상으로 출력되지 않음, '=='이어야함
				tField.setText(command);
			}else {
				tField.setText(tField.getText()+command); //일의 자리 이상으로 출력
			}
			startNumber = false;
		}else {
			if(startNumber) { //음수 상태 구분
				if(command.equals("-")) {
					tField.setText(command);
					startNumber=false;
				}else {
					operator=command;
				}
			}else {
				Double x = Double.parseDouble(tField.getText());
				
				if(operator.equals("+")) {
					result=result+x;
				}else if(operator.equals("-")) {
					result=result-x;
				}else if(operator.equals("*")) {
					result=result*x;
				}else if(operator.equals("/")) {
					result=result/x;
				}else if(operator.equals("=")) {
					result=x;
				}
			
				tField.setText(""+result);
				operator = command;
				startNumber = true;
			}
		}
	}
}
