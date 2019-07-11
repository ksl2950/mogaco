package Chapter15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyPanel3 extends JPanel implements ActionListener{
   JButton button;
   Color color = new Color(0,0,0);
   
   public MyPanel3() {
      setLayout(new BorderLayout()); //setLayout()은 컨테이너의 배치관리자를 설정하는 메소드
      button = new JButton("색상 변경");
      button.addActionListener(this); // 버튼에 이벤트 처리기를 붙인다.
      add(button, BorderLayout.SOUTH);
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(color);
      g.fillRect(10, 10, 210, 220);
   }
   //버튼이 눌려지면 e가 호출됨
   public void actionPerformed(ActionEvent e) {
      // 색상을 난수로 변경한다.
      color = new Color((int)(Math.random()*255.0),
            (int)(Math.random()*255.0), (int)(Math.random()*255.0));
      repaint(); //현재 컨테이너를 다시 그리게 하는 메소드.
   }
}

public class ColorTest extends JFrame{
   public ColorTest() {
      setSize(240, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Color Test");
      JPanel panel = new MyPanel3();
      add(panel);
      setVisible(true);
      
   }
   public static void main(String[] args) {
      ColorTest s = new ColorTest();
   }

}
