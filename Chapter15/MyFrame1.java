package Chapter15;

import java.awt.*;
import javax.swing.*;

class MyPanel1 extends JPanel{
	public void paintComponent (Graphics g) {
		super.paintComponent(g);//�ݵ�� �θ�Ŭ������ paintComponent()�� ȣ��
		g.drawString("�ȳ��ϼ��� �ڹ����α׷��� ������",10,10);
		g.drawLine(10,20,110,20);
		g.drawRect(10, 30, 100, 100);
		
	}
}

public class MyFrame1 extends JFrame{
	public MyFrame1() {
		setTitle("MyFrame");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel1 p =new MyPanel1(); //MyPanel1 ��ü ����
		setVisible(true);
		add(p);
	}
	public static void main(String[] args) {
		MyFrame1 frame=new MyFrame1();
	}

}
