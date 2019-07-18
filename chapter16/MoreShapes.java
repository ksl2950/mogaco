package chapter16;

import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Rectangle2D.Float;
import java.util.ArrayList;
import javax.swing.*;

public class MoreShapes extends JFrame {
	public MoreShapes() {
		setSize(600,130);
		setTitle("Java 2D Shapes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new MyPanel2();
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MoreShapes();
	}
}
class MyPanel2 extends JPanel{
	ArrayList<Shape> shapeArray = new ArrayList<Shape>();
	
	public MyPanel2() {
		Shape s;
		
		s=new Rectangle2D.Float(10,10,70,80);
		shapeArray.add(s);
		
		s=new RoundRectangle2D.Float(110,10,70,80,20,20);
		shapeArray.add(s);
		
		s=new Ellipse2D.Float(210,10,80,80);
		shapeArray.add(s);
		
		s=new Arc2D.Float(310,10,80,80,90,90,Arc2D.OPEN);
		shapeArray.add(s);
		
		s=new Arc2D.Float(410,10,80,80,0,180,Arc2D.CHORD);
		shapeArray.add(s);
		
		s=new Arc2D.Float(510,10,80,80,45,90,Arc2D.PIE);
		shapeArray.add(s);
		
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		// 엔타에일리어싱은 도형을 매끄럽게 그리기 위하여 설정한다. 연산시간은 조금 더 걸리지만 그만큼 그래픽의 품질이 좋아진다.
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(3));//setStroke메소드 이용하여 도형 그리는 두께를 설정할 수 있다.

		//shapearray에 저장된 shape객체들을 꺼내서 화면에 그려준다.
		for(Shape s:shapeArray)
			g2.draw(s);//Java2D의 도형들은 모두 shape 인터페이스를 구현하기 때문에 shape타입으로 생각할 수  있다.
	}
}
