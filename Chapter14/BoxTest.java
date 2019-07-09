package Chapter14;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame4 extends JFrame{
	
	public MyFrame4() {
		setTitle("BoxlayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel =new JPanel();
		
		//y�� �������� ������Ʈ�� �״´�
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		makeButton(panel,"button1");
		makeButton(panel,"button2");
		makeButton(panel,"button3");
		makeButton(panel,"button4");
		makeButton(panel,"button5");
		add(panel);
		pack();
		setVisible(true);
	}
	private void makeButton(JPanel panel,String text) {
		JButton button=new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(button); //boxLayout�� �߾ӿ� ��ư�� �߰��Ѵ�.
	}
}

public class BoxTest {
	public static void main(String[] args) {
		MyFrame4 f= new MyFrame4();
	}
}
