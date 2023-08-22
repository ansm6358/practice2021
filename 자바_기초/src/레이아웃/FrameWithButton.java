package ·¹ÀÌ¾Æ¿ô;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFrame;

public class FrameWithButton extends JFrame{
	Button buttons[];
	String label[] = {"OK","Yes","Good","Hi","Bye"};
	
	public FrameWithButton(String title) {
		super(title);
		buttons = new Button[5];
		this.setLayout(new FlowLayout());
		
		for(int i = 0; i<label.length; i++) {
			this.buttons[i] = new Button(label[i]);
			this.buttons[i].setBackground(Color.black);
			this.buttons[i].setForeground(Color.white);
			this.add(buttons[i]);
		}
		
		
	}
	public static void main(String[] args) {
		FrameWithButton f4 = new FrameWithButton("Frame With Button");
		f4.setSize(200,200);
		f4.setVisible(true);
	}


}
