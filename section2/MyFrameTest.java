package ����;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

class MyFrame extends JFrame{ //JFrame�̶�� �Ҹ���Ŭ������ ��ӹ޴´�.
	public MyFrame() {
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screensize= kit.getScreenSize(); // ���� ȭ���� ũ�⸦ ��´�.
		setSize(300,200);
		setLocation(screensize.width / 2, screensize.height /2);// ȭ�� �߾ӿ� ������ ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img =kit.getImage("icon.gif");
		setIconImage(img); //�������� icon.gif�� ���� icon.gif�� ��Ŭ������ ������Ʈ ������ �巡���Ѵ�.
		setLayout(new FlowLayout());
		JButton button=new JButton ("��ư");
		this.add(button);
		setVisible(true);
	}
}
public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f =new MyFrame(); //���ο��� ���ο� �ν��Ͻ��� �����Ѵ�.
	}
}
