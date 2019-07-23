package chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JPanel panel;
	//������ ��ü�� �̸� �������� ���´�.
	MyListener listener = new MyListener();

	public MyFrame3() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		panel = new JPanel();
		// �� ���� ��ư�� ������ �̺�Ʈ�� ������ ��ü�� ����Ѵ�.
		button1 = new JButton("�����");
		button1.addActionListener(listener);
		panel.add(button1);
		
		button2=new JButton("��ũ��");
		button2.addActionListener(listener);
		panel.add(button2);
		
		this.add(panel);
		this.setVisible(true);
	}

	//getSource()�� �̿��� �̺�Ʈ�ҽ��� ã�´�.
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
