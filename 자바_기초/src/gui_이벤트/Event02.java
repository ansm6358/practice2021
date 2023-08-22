package gui_¿Ã∫•∆Æ;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Event02 extends JFrame implements ActionListener{
	
	Label adressLabel, portLabel, bottomLabel; 
	TextField tf1, tf2;
	Button b;
	TextArea ta;
	Canvas c;
	Panel p1,p2;
	
	public Event02() {
		this.setLayout(new BorderLayout());
		
		this.p1 =new Panel();
		this.p1.setLayout(new GridLayout(1,2));
		this.adressLabel = new Label("Address");
		this.tf1 = new TextField();
		this.portLabel = new Label("Port#");
		this.tf2 = new TextField();
		this.b = new Button("Connect");
		this.b.addActionListener(this);
		this.p1.add(this.adressLabel);
		this.p1.add(this.tf1);
		this.p1.add(this.portLabel);
		this.p1.add(this.tf2);
		this.p1.add(this.b);
		
		this.p2 = new Panel();
		this.ta = new TextArea();
		this.c = new Canvas();
		this.p2.add(this.ta);
		this.p2.add(this.c);
		
		this.bottomLabel = new Label();
		
		this.add(this.p1, BorderLayout.NORTH);
		this.add(this.bottomLabel, BorderLayout.SOUTH);
		this.add(this.p2, BorderLayout.CENTER);	
		
		
	}

	public static void main(String[] args) {
		Event02 ev01 = new Event02();
		ev01.setSize(600, 300);
		ev01.setVisible(true);
		ev01.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.ta.setText("Address"+this.tf1.getText()+"Port#"+this.tf2.getText());
		this.bottomLabel.setText("Address"+this.tf1.getText()+"Port#"+this.tf2.getText());
	}

}
