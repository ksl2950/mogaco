package chapter16;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;//이벤트 처리를 위한 패키지

//MyListener 클래스를 별도의 클래스로 정의한다
class MyListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("송이최고");
		
	}
}

class MyFrame1 extends JFrame {

	JButton button;

	public MyFrame1() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		this.setLayout(new FlowLayout());
		button = new JButton("버튼 눌러바랑");
		button.addActionListener(new MyListener());
		this.add(button);
		this.setVisible(true);
	}

}

public class ActionEventTest1 {
	public static void main(String[] args) {
		MyFrame1 t = new MyFrame1();
	}

}
