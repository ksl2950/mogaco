package 모각코;

import java.awt.*;
import javax.swing.*;

class MyFrame4 extends JFrame{
   public MyFrame4() {
      setSize(500, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("테스트 프레임");
      
      JPanel panel = new JPanel();//컨테이너로 패널을 사용
      JButton b1 = new JButton("버튼");
      b1.setText("왼쪽 버튼");
      JButton b2 = new JButton("중앙 버튼");
      JButton b3 = new JButton("오른쪽 버튼");
      b3.setEnabled(false);// 세 번째 버튼을 불활성으로 설정
      // 컴포넌트를 패널에 추가 
      panel.add(b1);//패널에 b1 추가
      panel.add(b2);//패널에 b2 추가
      panel.add(b3);//패널에 b3 추가
      
      add(panel);//패널을 프레임에 추가
      setVisible(true);
   }
}
public class MyFrameTest포 {
   public static void main(String[] args) {
      MyFrame4 f = new MyFrame4();
   }
}

