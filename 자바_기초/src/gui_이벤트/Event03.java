package gui_이벤트;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Event03 extends JFrame implements ActionListener{
	
	Label adressLabel, portLabel, bottomLabel; 
	TextField tf1, tf2;
	Panel p1, p2, p3, p4;
	Checkbox cb;
	Button b1,b2;
	Panel p[];
	Button b[];
	List l[];
	
	public Event03() {
		this.setLayout(new BorderLayout());
		
		String s[] = {"Image", "User", "CPU", "CPU Time", "Mem"};
		
		this.p1 =new Panel();
		this.p1.setLayout(new GridLayout(1,5));
		this.adressLabel = new Label("Address");
		this.tf1 = new TextField();
		this.portLabel = new Label("Port#");
		this.tf2 = new TextField();
		this.b1 = new Button("Connect");
		this.b1.addActionListener(this);
		this.p1.add(this.adressLabel);
		this.p1.add(this.tf1);
		this.p1.add(this.portLabel);
		this.p1.add(this.tf2);
		this.p1.add(this.b1);
		
		this.p2 = new Panel();
		this.p3 = new Panel();
		this.p2.setLayout(new BorderLayout());
		this.p3.setLayout(new GridLayout(1,5));
		this.p = new Panel[5];
		this.b = new Button[5];
		this.l = new List[5];
		
		
		for(int i= 0; i<s.length; i++) {
			this.p[i] = new Panel();
			this.p[i].setLayout(new BorderLayout());
			this.b[i] = new Button(s[i]);
			this.b[i].setActionCommand(s[i]);
			this.l[i] = new List();
			this.p[i].add(this.b[i], BorderLayout.NORTH);
			this.p[i].add(this.l[i], BorderLayout.CENTER);
			this.p3.add(this.p[i]);
		}
		
		this.p4 = new Panel();
		this.cb =new Checkbox("프로세스표시");
		this.b2 = new Button("끝내기");
		this.p4.add(this.cb);
		this.p4.add(this.b2);
		
		this.p2.add(this.p4, BorderLayout.SOUTH);
		this.p2.add(this.p3, BorderLayout.CENTER);
		
		this.bottomLabel = new Label();
		this.add(this.p1, BorderLayout.NORTH);
		this.add(this.bottomLabel, BorderLayout.SOUTH);
		this.add(this.p2, BorderLayout.CENTER);	
	}
	
	public static void main(String[] args) {
		Event03 ev03 = new Event03();
		ev03.setSize(600, 300);
		ev03.setVisible(true);
		ev03.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.bottomLabel.setText("Address"+this.tf1.getText()+"Port#"+this.tf2.getText());
	}
}
