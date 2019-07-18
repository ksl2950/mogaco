package chapter16;

import java.awt.*;

public class FrontListener {
	public static void main(String[] args) {
		String[]front_list;
		GraphicsEnvironment g;
		g=GraphicsEnvironment.getLocalGraphicsEnvironment();
		front_list=g.getAvailableFontFamilyNames();
		for(int i=0; i<front_list.length;i++)
			System.out.println(front_list[i]);
	}
}
