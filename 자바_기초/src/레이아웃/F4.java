package ·¹ÀÌ¾Æ¿ô;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JFrame;

public class F4 extends JFrame{

	public F4() {
		this.setLayout(new FlowLayout());
		
		Panel p1 = new Panel();
		p1.setSize(100,100);
		Panel p2 = new Panel();
		p2.setSize(100,100);
		Panel p3 = new Panel();
		p3.setSize(100,100);
		Panel p4 = new Panel();
		p4.setSize(100,100);
		
		p1.setBackground(Color.red);
		p2.setBackground(Color.yellow);
		p3.setBackground(Color.green);
		p4.setBackground(Color.blue);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
	}
	public static void main(String[] args) {
		F4 f4 = new F4();
		f4.setSize(200,200);
		f4.setVisible(true);
	}


}
