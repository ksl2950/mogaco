package chapter16;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame{
	
	BufferedImage img=null;
	public MyImageFrame() {
		setTitle("Image Load");
		
		try {
			img = ImageIO.read(new File("C:\\Users\\LG\\Desktop\\toy.PNG"));
			}
			catch (IOException e) {
				//오류가 발생하면 프로그램을 종료한다.
				System.out.println(e.getMessage());
				System.exit(0);
			}
			
			add(new MyPanel3());
			pack();
			setVisible(true);
		}
		
		class MyPanel3 extends JPanel{
			public void paint(Graphics g) {
				g.drawImage(img,0,0,null);
			}
			
			public Dimension getPreferredSize() {
				if(img == null) {
					return new Dimension(100,100);}
				else {
					return new Dimension(img.getWidth(null),img.getHeight());
				}
			}
		}
		
		public static void main(String[] args) {
			new MyImageFrame();
		}
	}

