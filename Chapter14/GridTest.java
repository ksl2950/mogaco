package Chapter14;
import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame{
	public MyFrame3() {
		
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3)); //3개의 열과 필요한 만큼의 행
		
		add(new JButton("button1"));
		add(new JButton("button2"));
		add(new JButton("button3"));
		add(new JButton("b4"));
		add(new JButton("long button5"));
		
		pack();
		setVisible(true);
	}
}
public class GridTest {
	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}
}
