package 모각코;
import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame{
	public MyFrame3() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel=new JPanel();
		JLabel label = new JLabel("안녕하세요?"); 
		JButton button = new JButton("버튼"); //레이블과 버트 생성
		panel.add(label);
		panel.add(button); //패널에 레이블과 버튼 추가  컨테이너 종류중 하나가 패널?
		add(panel);//패널을 프레임에 추가
		setVisible(true);
		}
}
public class MyFrameTest3 {
	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}

}
