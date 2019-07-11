package Chapter15;

import java.awt.*;
import javax.swing.*;

class MyPanel1 extends JPanel{
	public void paintComponent (Graphics g) {
		super.paintComponent(g);//반드시 부모클래스의 paintComponent()를 호출
		g.drawString("안녕하세요 자바프로그래머 여러분",10,10);
		g.drawLine(10,20,110,20);
		g.drawRect(10, 30, 100, 100);
		
	}
}

public class MyFrame1 extends JFrame{
	public MyFrame1() {
		setTitle("MyFrame");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel1 p =new MyPanel1(); //MyPanel1 객체 생성
		setVisible(true);
		add(p);
	}
	public static void main(String[] args) {
		MyFrame1 frame=new MyFrame1();
	}

}
