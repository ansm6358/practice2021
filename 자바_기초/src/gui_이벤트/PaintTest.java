package gui_�̺�Ʈ;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class PaintTest extends Frame implements MouseListener{ //�� ����� frame������ �ǰ� JFrame������ �� �Ǵ� �� ���� �۵� ������ �ٸ� ���ϴ� JFrame������ repaint���� ������Ʈ�� �Ⱥθ��� ����

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
