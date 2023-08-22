package 이벤트_기초;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Event01 extends JFrame implements ActionListener, MouseMotionListener{

	Button b1,b2,b3,b4;
	Panel p1;
	
	public	Event01() {
		super();
		
		this.setLayout(new BorderLayout());
		
		this.p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		
		this.b1 = new Button("Red");
		this.b2 = new Button("Green");
		this.b3 = new Button("Blue");
		this.b4 = new Button("");
		
		this.p1.add(b1);
		this.p1.add(b2);
		this.p1.add(b3);
		this.p1.add(b4);
		
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		this.b3.addActionListener(this);
		this.addMouseMotionListener(this);
		
		this.add(p1, BorderLayout.EAST);
		
	}
			

	
	public static void main(String[] args) {
		Event01 ev01 = new Event01();
		ev01.setSize(300,300);
		ev01.setVisible(true);
	}



	public void mouseDragged(MouseEvent e) {
		this.b4.setLabel(e.getX()+","+e.getY());

	}



	public void mouseMoved(MouseEvent e) {
			
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Red")) {
			this.getContentPane().setBackground(Color.red); //***프레임의 색을 바꿀 때는 반드시 .getContentPane()를 넣어줄 것***
		} else if(e.getActionCommand().equals("Green")) {
			this.getContentPane().setBackground(Color.GREEN);
		} else if(e.getActionCommand().equals("Blue")) {
			this.getContentPane().setBackground(Color.BLUE);
		}
	}

}
