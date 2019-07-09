package Chapter14;
import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setLayout(new BorderLayout());//�������� ����Ʈ�� Borderlayout�̹Ƿ�  ����� ���ʿ�
		
		//��ư �߰�
		add(new JButton("A"),BorderLayout.CENTER);
		add(new JButton("B"),BorderLayout.LINE_START);
		add(new JButton("C"),BorderLayout.LINE_END);
		add(new JButton("D"),BorderLayout.PAGE_START);
		add(new JButton("E"),BorderLayout.PAGE_END);
		
		pack();
		setVisible(true);
	}
}

public class BorderTest {
	public static void main(String[] args) {
		MyFrame2 f=new MyFrame2();
}
}
