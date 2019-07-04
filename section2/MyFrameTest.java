package 모각코;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

class MyFrame extends JFrame{ //JFrame이라고 불리는클래스를 상속받는다.
	public MyFrame() {
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screensize= kit.getScreenSize(); // 현재 화면의 크기를 얻는다.
		setSize(300,200);
		setLocation(screensize.width / 2, screensize.height /2);// 화면 중앙에 프레임 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img =kit.getImage("icon.gif");
		setIconImage(img); //아이콘을 icon.gif로 변경 icon.gif를 이클립스의 프로젝트 폴더로 드래그한다.
		setLayout(new FlowLayout());
		JButton button=new JButton ("버튼");
		this.add(button);
		setVisible(true);
	}
}
public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f =new MyFrame(); //메인에서 새로운 인스턴스를 생성한다.
	}
}
