package ����;

import java.awt.*;
import javax.swing.*;

class MyFrame6 extends JFrame{
   public MyFrame6() {
      setSize(500, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("MyFrame");
      
      JPanel panel = new JPanel();//�����̳ʷ� �г��� ���
      JPanel panelA=new JPanel();
      JPanel panelB=new JPanel();
      
     JLabel label = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ���������� �����Ͻÿ�");
     panelA.add(label);
     JButton button1 = new JButton("�޺�����");
     JButton button2= new JButton("������������");
     JButton button3= new JButton("�Ұ������");
     panelB.add(button1);
     panelB.add(button2);
     panelB.add(button3);
     
      panel.add(panelA);
      panel.add(panelB); //�г�A�� �г�B�� �гο� �߰��Ѵ�.
      add(panel);//�г��� �����ӿ� �߰��Ѵ�.
      setVisible(true);
      
   }
}
public class MyFrameTest6 {
	public static void main(String[] args) {
		MyFrame6 f =new MyFrame6();
	}

}
