package practice.test.cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_function extends JFrame{
	
	private JTextField inputSpace;
	
	//계산 기능 구현 위해 ArrayList에 숫자와 연산 기호를 하나씩 구분하여 담기
	private ArrayList<String> equation=new ArrayList<String>();
	
	//계산식의 숫자를 담을 변수 num
	private String num="";
	
	public Calculator_function() {
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
			buttons[i].addActionListener(new PadActionListener());
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
	
	class PadActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String operation=e.getActionCommand();
//			System.out.println("e.getActionCommand() : " +e.getActionCommand());
//			System.out.println("operation : "+operation);
			
			if(operation.equals("C")) { //초기화
				inputSpace.setText("");
			}else if(operation.equals("=")) { //계산 실행
				//입력된 식에 의해 계산된 값이 나오도록 출력
				String result=Double.toString(calculate(inputSpace.getText()));
				inputSpace.setText(""+result);
				num="";
			}else { //초기화나 계산을 실행한 것이 아니라면
				inputSpace.setText(inputSpace.getText()+e.getActionCommand());
			}
		}
	}
	
	private void fullTextParsing(String inputText) {
		equation.clear();
		
		for (int i = 0; i < inputText.length(); i++) {
			char ch=inputText.charAt(i);
		
			if(ch=='-' || ch=='+' || ch=='*' || ch=='/') {
				equation.add(num);
				num="";
				equation.add(ch+"");
			}else {
				num=num+ch;
			}
		}
		equation.add(num);
	}

	public double calculate(String inputText) {
		fullTextParsing(inputText);
		
		double prev=0;
		double current=0;
		String mode="";
		
		for (String s : equation) {
			if(s.equals("+")) {
				mode="add";
			}else if(s.equals("-")) {
				mode="sub";
			}else if(s.equals("*")) {
				mode="mul";
			}else if(s.equals("/")) {
				mode="div";
			}else {
				current=Double.parseDouble(s);
				if(mode=="add") {
					prev+=current;
				}else if(mode=="sub") {
					prev-=current;
				}else if(mode=="mul") {
					prev*=current;
				}else if(mode=="div") {
					prev/=current;
				}else {
					prev=current;
				}
			}
		}
		
		return prev;
	}
	
	public static void main(String[] args) {
		new Calculator_function();
	}
}
