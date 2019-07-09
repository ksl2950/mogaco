package Chapter14;

import java.awt.*;
import javax.swing.*;

class MyFrame1 extends JFrame{
	public MyFrame1() {
		
		setTitle("Flowlayouttest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		// 패널을 생성하고 배치관리자를 FlowLayout으로 설정
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("Button4"));
		panel.add(new JButton("Long Button5"));//패널에 버튼추가
		add(panel);// 패널을 프레임에 추가
		
		pack();
		setVisible(true);
		
	}
}

public class Flowtest {
	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();
	}
}
