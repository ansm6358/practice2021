package ·¹ÀÌ¾Æ¿ô;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JFrame;

public class F5 extends JFrame{

	public F5() {
		this.setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		Panel p5 = new Panel();
		
		p1.setBackground(Color.red);
		p2.setBackground(Color.yellow);
		p3.setBackground(Color.green);
		p4.setBackground(Color.blue);
		p5.setBackground(Color.cyan);
		
		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		this.add(p3,BorderLayout.EAST);
		this.add(p4,BorderLayout.WEST);
		this.add(p5,BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		F5 f4 = new F5();
		f4.setSize(200,200);
		f4.setVisible(true);
	}


}
