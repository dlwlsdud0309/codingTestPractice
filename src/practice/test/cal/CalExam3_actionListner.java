package practice.test.cal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalExam3_actionListner extends JFrame implements ActionListener{
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
	
	public CalExam3_actionListner() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 250);
		setLayout(new BorderLayout());
		
		tField=new JTextField(45);
		panel=new JPanel();
		tField.setText("0.");
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		
		buttons=new JButton[25];
		int index=0;
		
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				
				buttons[index]=new JButton(labels[index]);
				buttons[index].addActionListener(this);
				
				if (col>=3) {
					buttons[index].setForeground(Color.red);
				}else {
					buttons[index].setForeground(Color.blue);
				}
				
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}
		
		add("North",tField);
		add("Center",panel);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new CalExam3_actionListner();
	}
}
