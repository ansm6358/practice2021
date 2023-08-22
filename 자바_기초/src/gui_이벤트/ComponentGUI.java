package gui_이벤트�̺�Ʈ;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class ComponentGUI extends JFrame implements ItemListener, ActionListener, MouseMotionListener {

	Panel p1, p2, p3;
	Button b1, b2, b3;
	TextField tf1;
	Choice c1;
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6;
	List l1;
	Label la1;
	TextArea ta1;
	CheckboxGroup cbg1;

	public ComponentGUI(String title) {
		super(title);
		this.setLayout(new BorderLayout());
		
		this.p1 = new Panel();
		this.p1.setLayout(new GridLayout(1,3));
		this.b1 = new Button("Ok");
		this.b2 = new Button("Cancel");
		this.b3 = new Button("Help");
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		this.b3.addActionListener(this);
		this.p1.add(b1);
		this.p1.add(b2);
		this.p1.add(b3);
		
		this.p2 = new Panel();
		this.p2.setLayout(new GridLayout(2,1));
		this.tf1 = new TextField();
		this.p2.add(this.p1);
		this.p2.add(this.tf1);
		
		this.p3 = new Panel();
		this.p3.setLayout(new GridLayout(8,1));
		this.c1 = new Choice();
		this.c1.add("Choice1");
		this.c1.add("Choice2");
		this.c1.add("Choice3");
		this.c1.addItemListener(this);
		
		this.cbg1 = new CheckboxGroup();
		this.cb1 = new Checkbox("CheckBox1");
		this.cb2 = new Checkbox("CheckBox2");
		this.cb3 = new Checkbox("CheckBox3");
		this.cb4 = new Checkbox("CheckBox4",cbg1, false);
		this.cb5 = new Checkbox("CheckBox5",cbg1, false);
		this.cb6 = new Checkbox("CheckBox6",cbg1, false);
		
		this.l1 = new List(3);
		this.l1.add("List1");
		this.l1.add("List2");
		this.l1.add("List3");
		
		this.p3.add(this.c1);
		this.p3.add(this.cb1);
		this.p3.add(this.cb2);
		this.p3.add(this.cb3);
		this.p3.add(this.cb4);
		this.p3.add(this.cb5);
		this.p3.add(this.cb6);
		this.p3.add(this.l1);
		
		this.la1 = new Label();
		
		this.ta1 = new TextArea();
		this.ta1.addMouseMotionListener(this);
		
		this.add(this.p2, BorderLayout.NORTH);
		this.add(this.p3, BorderLayout.WEST);
		this.add(this.la1, BorderLayout.SOUTH);
		this.add(this.ta1, BorderLayout.CENTER);
		this.setSize(400,500);
		this.getContentPane().setBackground(Color.orange);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.tf1.setText("("+e.getX()+", "+e.getY()+")");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			this.ta1.setBackground(Color.cyan);
		}else if(e.getSource() == b2) {
			this.ta1.setBackground(Color.white);
		}else if(e.getSource() == b3) {
			this.ta1.setBackground(Color.orange);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		this.la1.setText(e.getItem()+"/"+e.getStateChange()+"/"+e.paramString());
	}

	public static void main(String[] args) {
		ComponentGUI f = new ComponentGUI("New Title");
	}

}
