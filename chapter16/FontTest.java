package chapter16;
import java.awt.*;
import javax.swing.*;

class MyPanel1 extends JPanel{
	
	Font f1,f2,f3,f4,f5;
	//생성자에서 논리적인 폰트를 생성한다.
	public MyPanel1() {
		f1=new Font("serif",Font.PLAIN,20);
		f2=new Font("San Serif",Font.BOLD,20);
		f3=new Font("Monospaced",Font.ITALIC,20);
		f4=new Font("Dialog",Font.BOLD|Font.ITALIC,20);
		f5=new Font("DialogInput",Font.BOLD,20);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(f1);//폰트를 변경한다.
		g.drawString("serif 20 points PLAIN", 10, 50);
		g.setFont(f2);
		g.drawString("SanSerif 20 points BOLD",10, 70);
		g.setFont(f3);
		g.drawString("Monospaced 20 points ITALIC", 10, 90);
		g.setFont(f4);
		g.drawString("Dialog 20 points BOLD + ITALIC", 10, 110);
		g.setFont(f5);
		g.drawString("Dialoginput 20 points BOLD", 10, 130);
	}
}

public class FontTest extends JFrame{
	public FontTest() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Font Test");
		JPanel panel=new MyPanel1();
		add(panel);
		setVisible(true);
	}
public static void main(String[] args) {
	FontTest s=new FontTest();
}
}
