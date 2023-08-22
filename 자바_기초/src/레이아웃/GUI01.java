package ·¹ÀÌ¾Æ¿ô;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFrame;

public class GUI01 extends JFrame {

	Panel p1, p2, p3, p4;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

	public GUI01() {
		this.setLayout(new BorderLayout());
		
		this.p1 = new Panel();
		this.p2 = new Panel();
		this.p3 = new Panel();
		this.p4 = new Panel();
		
		this.b1 = new Button("1");
		this.b2 = new Button("2");
		this.b3 = new Button("3");
		this.b4 = new Button("4");
		this.b5 = new Button("5");
		this.b6 = new Button("6");
		this.b7 = new Button("7");
		this.b8 = new Button("8");
		this.b9 = new Button("9");
		
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.WEST);
		this.add(b9,BorderLayout.CENTER);
		
		this.p1.setLayout(new GridLayout(1,3));
		this.p1.add(b1);
		this.p1.add(b2);
		this.p1.add(b3);
		
		this.p2.setLayout(new GridLayout(2,1));
		this.p2.add(p3);
		this.p2.add(p4);
		
		this.p3.setLayout(new GridLayout(3,1));
		this.p3.add(b4);
		this.p3.add(b5);
		this.p3.add(b6);
		
		this.p4.setLayout(new FlowLayout());
		this.p4.add(b7);
		this.p4.add(b8);
	}

	public static void main(String[] args) {
		GUI01 f4 = new GUI01();
		f4.setSize(400, 300);
		f4.setVisible(true);
	}

}
