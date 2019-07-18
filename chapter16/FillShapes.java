package chapter16;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;

class MyComponent extends JComponent{
	
	public void paint(Graphics g) {
		Graphics2D g2=(Graphics2D) g;
		//엔티 에일리어싱을 설정한다.
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON );
		
		g2.setStroke(new BasicStroke(3));
		GradientPaint gp = new GradientPaint(0,10,Color.white,0,70,Color.red);//객체 생성
		//사각형
		g2.setPaint(Color.red);
		g2.fill(new Rectangle2D.Float(10,10,70,80));
		//둥근 사각형
		g2.setPaint(gp);
		g2.fill(new RoundRectangle2D.Float(110,10,70,80,20,20));
	}
}

public class FillShapes{
	public static void main(String[] args) {
		new MyComponent();
	}
	


}
