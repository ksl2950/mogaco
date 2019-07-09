package Chapter14;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame4 extends JFrame{
	
	public MyFrame4() {
		setTitle("BoxlayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel =new JPanel();
		
		//y축 방향으로 컴포넌트를 쌓는다
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
		panel.add(button); //boxLayout의 중앙에 버튼을 추가한다.
	}
}

public class BoxTest {
	public static void main(String[] args) {
		MyFrame4 f= new MyFrame4();
	}
}
