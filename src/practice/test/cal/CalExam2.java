package practice.test.cal;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalExam2 extends JFrame{
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels= {
		"backspace","","","CE","C",
		"7","8","9","/","sqrt",
		"4","5","6","x","%",
		"1","2","3","-","1/x",
		"0","+/-",".","+","="
	};
	
	public CalExam2() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 250);
		tField=new JTextField();
		panel=new JPanel();
		tField.setText("0.");
		buttons=new JButton[25];
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		
		int index=0;
		
		//for문 사용하여 버튼 생성하기
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
//				System.out.println(index++);
				buttons[index]=new JButton(labels[index]);
				panel.add(buttons[index]);
				index++;
			}
		}
		add("North",tField);
		add("Center",panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CalExam2();
	}
}
