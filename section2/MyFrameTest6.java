package 모각코;

import java.awt.*;
import javax.swing.*;

class MyFrame6 extends JFrame{
   public MyFrame6() {
      setSize(500, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("MyFrame");
      
      JPanel panel = new JPanel();//컨테이너로 패널을 사용
      JPanel panelA=new JPanel();
      JPanel panelB=new JPanel();
      
     JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다. 피자종류를 선택하시오");
     panelA.add(label);
     JButton button1 = new JButton("콤보피자");
     JButton button2= new JButton("포테이토피자");
     JButton button3= new JButton("불고기피자");
     panelB.add(button1);
     panelB.add(button2);
     panelB.add(button3);
     
      panel.add(panelA);
      panel.add(panelB); //패널A와 패널B를 패널에 추가한다.
      add(panel);//패널을 프레임에 추가한다.
      setVisible(true);
      
   }
}
public class MyFrameTest6 {
	public static void main(String[] args) {
		MyFrame6 f =new MyFrame6();
	}

}
