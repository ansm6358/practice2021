package 멀티스레드;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;

public class TG extends JFrame implements AdjustmentListener{

	Scrollbar sb1, sb2;
	Button b1, b2;
	Panel p1, p2;
	BGChread bgc;
	BGTTread bgt;

	public TG() {
		this.setLayout(new GridLayout(1, 2));

		this.p1 = new Panel(new BorderLayout());
		this.p2 = new Panel(new BorderLayout());

		this.sb1 = new Scrollbar(Scrollbar.HORIZONTAL, 0,1,0,1000);
		this.sb2 = new Scrollbar(Scrollbar.HORIZONTAL, 0,1,0,100);

		this.b1 = new Button();
		this.b2 = new Button();
		
		this.bgc = new BGChread();
		this.bgc.start();
		
		this.bgt = new BGTTread();
		this.bgt.start();
		
		this.sb1.addAdjustmentListener(this);
		this.sb2.addAdjustmentListener(this);
		
		p1.add(BorderLayout.NORTH, sb1);
		p1.add(BorderLayout.CENTER, b1);
		p2.add(BorderLayout.NORTH, sb2);
		p2.add(BorderLayout.CENTER, b2);
		
		this.add(p1);
		this.add(p2);
		
		
	}

	public static void main(String[] args) {
		TG db = new TG();
		db.setSize(500, 300);
		db.setVisible(true);
		db.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class BGChread extends Thread {
		int interver;
		public void run() {
			while (true) {
				try {
					int rr = (int) (Math.random() * 1000) % 256;
					int gg = (int) (Math.random() * 1000) % 256;
					int bb = (int) (Math.random() * 1000) % 256;
					b1.setBackground(new Color(rr, gg, bb));
					sleep(this.interver);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		public void setInterver(int value) {
			this.interver = value;
		}
	}

	class BGTTread extends Thread {
		int size;
		
		public void run() {
			while (true) {
				try {
					int rr = (int) (Math.random() * 1000) % 256;
					int gg = (int) (Math.random() * 1000) % 256;
					int bb = (int) (Math.random() * 1000) % 256;
					b2.setForeground(new Color(rr, gg, bb));
					b2.setFont(new Font("TimesRoman", Font.BOLD, size));
					sleep(size);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		public void setFontSize(int value) {
			this.size = value;
		}


	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if(e.getSource()==sb1) {
			b1.setLabel(""+e.getValue());
			bgc.setInterver(e.getValue());
		} else if(e.getSource()==sb2) {
			b2.setLabel(""+e.getValue());
			bgt.setFontSize(e.getValue());
			
		}
		
	}
}
