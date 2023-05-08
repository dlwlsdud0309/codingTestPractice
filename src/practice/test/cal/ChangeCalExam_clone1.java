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

public class ChangeCalExam_clone1 extends JFrame implements ActionListener{
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
	
	public ChangeCalExam_clone1() {
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
		
		//반복문 사용하여 버튼 부착
		for (int i = 0; i < button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			
			buttons[i].addActionListener(this);
			
			buttons[i].setFont(new Font("Arial",Font.BOLD,20));
			
			if (button_names[i]=="C") {
				tField.setText("0.0");
				buttons[i].setBackground(Color.red);
			}else if((i>=4 && i<=6) || (i>=8 && i<=10) || (i>=12 && i<=14)) {
				buttons[i].setBackground(Color.black);
			}else {
				buttons[i].setBackground(Color.gray);
			}
			buttons[i].setForeground(Color.white); //글씨색
			buttons[i].setBorderPainted(false); //테두리 없애기
			
			panel.add(buttons[i]);
		}
		
		add(tField);
		add(panel);
		
		setVisible(true);
	}
	
	private double result=0;
	private String operator="=";
	private boolean startNumber=true;
	
	
	public static void main(String[] args) {
		new ChangeCalExam_clone1();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		
		if (command.equals("C")) {
			startNumber=true;
			result=0;
			operator="=";
			tField.setText("0.0");
		}else if(command.charAt(0)>='0' && command.charAt(0)<='9' || command.equals(".")) {
			if(startNumber==true) {
				tField.setText(command);
			}else {
				tField.setText(tField.getText()+command);
			}
			startNumber=false;
		}else {
			if(startNumber) { //음수 상태 구분
				if(command.equals("-")) {
					tField.setText(command);
					startNumber=false;
				}else {
					operator=command;
				}
			}else {
				Double x=Double.parseDouble(tField.getText());
				
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
				operator=command;
				startNumber=true;
			}
		}
	}
}
