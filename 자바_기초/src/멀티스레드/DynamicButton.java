package 멀티스레드;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class DynamicButton extends JFrame {

	Button b1, b2;
	BGThread bgt;
	FontTread fnt;

	public DynamicButton() {
		this.setLayout(new GridLayout(1, 2));
		this.b1 = new Button("OK");
		this.b2 = new Button("YES");
		this.add(b1);
		this.add(b2);
		this.bgt = new BGThread();
		this.fnt = new FontTread();
		this.bgt.start();
		this.fnt.start();
	}

	public static void main(String[] args) {
		DynamicButton db = new DynamicButton();
		db.setSize(500, 300);
		db.setVisible(true);
		db.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class BGThread extends Thread {
		public void run() {
			while (true) {
				try {
					int rr = (int) (Math.random() * 1000) % 256;
					int gg = (int) (Math.random() * 1000) % 256;
					int bb = (int) (Math.random() * 1000) % 256;
					b1.setBackground(new Color(rr, gg, bb));
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	class FontTread extends Thread {
		public void run() {
			while (true) {
				try {
					int sz = (int) (Math.random() * 1000) % 100;
					int st = (int) (Math.random() * 1000) % 3;
					if(st ==0) {b2.setFont(new Font("TimesRoman", Font.ITALIC, sz));}
					if(st ==1) {b2.setFont(new Font("TimesRoman", Font.PLAIN, sz));}
					if(st ==2) {b2.setFont(new Font("TimesRoman", Font.BOLD, sz));}
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
