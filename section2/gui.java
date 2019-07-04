package 모각코;

import javax.swing.*;

public class gui { 
	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");//JFrame 객체 생성 
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//사용자가 오른쪽 상단에 있는 close버튼을 눌렀을 경우 어떤 동작울 취하느냐를 설정한다. 전체 프로그램 종료.
		f.setVisible(true);//프레임을 화면에 나타나게 함
	} 
}
