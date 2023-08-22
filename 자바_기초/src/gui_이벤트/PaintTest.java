package gui_이벤트;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class PaintTest extends Frame implements MouseListener{ //이 방식은 frame에서만 되고 JFrame에서는 안 되는 듯 둘이 작동 원리가 다른 듯하다 JFrame에서는 repaint에서 업데이트를 안부르는 듯함

	int x= 40, y=40;
	
	
	public PaintTest() {
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		System.out.println("painting(g) called");
		g.setColor(Color.red);
		g.fill3DRect(x+10, y+10, 30, 30, true);
		
	}
	
//	public void update(Graphics g) {
//		System.out.println("update(g) called");
//		g.setColor(Color.blue);
//		g.fill3DRect(x, y, 30, 30, true);
//		
//		paint(g);
//		
//	}
	
	public static void main(String[] args) {
		PaintTest d = new PaintTest();
		d.setSize(400, 400);
		d.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
