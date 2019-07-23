package chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JPanel panel;
	//리스너 객체를 미리 생성시켜 놓는다.
	MyListener listener = new MyListener();

	public MyFrame3() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		panel = new JPanel();
		// 두 개의 버튼에 동일한 이벤트로 리스너 객체를 등록한다.
		button1 = new JButton("노란색");
		button1.addActionListener(listener);
		panel.add(button1);
		
		button2=new JButton("핑크색");
		button2.addActionListener(listener);
		panel.add(button2);
		
		this.add(panel);
		this.setVisible(true);
	}

	//getSource()를 이용항 이벤트소스를 찾는다.
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				panel.setBackground(Color.YELLOW);
			} else if (e.getSource() == button2) {
				panel.setBackground(Color.PINK);
			}
		}
	}
}

public class ActionEventTest3 {
	public static void main(String[] args) {
		MyFrame3 t = new MyFrame3();

	}
}
