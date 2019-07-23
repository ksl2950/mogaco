package chapter16;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;//�̺�Ʈ ó���� ���� ��Ű��

//MyListener Ŭ������ ������ Ŭ������ �����Ѵ�
class MyListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("�����ְ�");
		
	}
}

class MyFrame1 extends JFrame {

	JButton button;

	public MyFrame1() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		this.setLayout(new FlowLayout());
		button = new JButton("��ư �����ٶ�");
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
