package me.cameronwitcher.testing;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main {
	// execute application
	public static void main(String args[]) {
		JFrame frame = new JFrame("Bouncing Ball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BallPanel bp = new BallPanel();
		frame.add(bp);
		frame.setSize(300, 300); // set frame size
		frame.setVisible(true); // display frame
	} // end main
}

// class BallPanel

class BallPanel extends JPanel implements ActionListener {
	private int delay = 1;
	protected Timer timer;
	Polygon p1;
	Polygon p2;
	Polygon p3;
	Polygon p4;
	

	private int x = 20; // x position
	private int y = 20; // y position
	private int x2 = 30; // x position
	private int y2 = 30; // y position
	private int x3 = 40; // x position
	private int y3 = 40; // y position
	private int x4 = 50; // x position
	private int y4 = 50; // y position
	private int radius = 15; // ball radius

	private int dx = 5; // increment amount (x coord)
	private int dy = 2; // increment amount (y coord)
	private int dx2 = 2; // increment amount (x coord)
	private int dy2 = 2; // increment amount (y coord)
	private int dx3 = 6; // increment amount (x coord)
	private int dy3 = 2; // increment amount (y coord)
	private int dx4 = 4; // increment amount (x coord)
	private int dy4 = 1; // increment amount (y coord)

	public BallPanel() {
		timer = new Timer(delay, this);
		timer.start(); // start the timer
	}

	public void actionPerformed(ActionEvent e)
	// will run when the timer fires
	{
		repaint();
	}

	// draw rectangles and arcs
	public void paintComponent(Graphics g) {
		
		timer.setDelay(2);
		
		
		super.paintComponent(g); // call superclass's paintComponent
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.GREEN);

		// check for boundaries
		if (x < radius)
			dx = Math.abs(dx);
		if (x > getWidth() - radius)
			dx = -Math.abs(dx);
		if (y < radius)
			dy = Math.abs(dy);
		if (y > getHeight() - radius)
			dy = -Math.abs(dy);
		
		if (x2 < radius)
			dx2 = Math.abs(dx2);
		if (x2 > getWidth() - radius)
			dx2 = -Math.abs(dx2);
		if (y2 < radius)
			dy2 = Math.abs(dy2);
		if (y2 > getHeight() - radius)
			dy2 = -Math.abs(dy2);
		
		if (x3 < radius)
			dx3 = Math.abs(dx3);
		if (x3 > getWidth() - radius)
			dx3 = -Math.abs(dx3);
		if (y3 < radius)
			dy3 = Math.abs(dy3);
		if (y3 > getHeight() - radius)
			dy3 = -Math.abs(dy3);
		
		if (x4 < radius)
			dx4 = Math.abs(dx4);
		if (x4 > getWidth() - radius)
			dx4 = -Math.abs(dx4);
		if (y4 < radius)
			dy4 = Math.abs(dy4);
		if (y4 > getHeight() - radius)
			dy4 = -Math.abs(dy4);
		
		

		// adjust ball position
		x += dx;
		y += dy;
		
		x2 += dx2;
		y2 += dy2;
		
		
		x3 += dx3;
		y3 += dy3;
		
		x4 += dx4;
		y4 += dy4;
		
		
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
		

		g.setColor(Color.RED);
		
		g.fillOval(x2 - radius, y2 - radius, radius * 2, radius * 2);
		
		

		g.setColor(Color.BLUE);


		g.fillOval(x3 - radius, y3 - radius, radius * 2, radius * 2);
		
		g.setColor(Color.YELLOW);


		g.fillOval(x4 - radius, y4 - radius, radius * 2, radius * 2);
		
		p1 = new Polygon(new int[] {x-radius,x+radius,x+radius,x-radius}, new int[] {y-radius,y-radius,y+radius,y+radius}, 4);
		p2 = new Polygon(new int[] {x2-radius,x2+radius,x2+radius,x2-radius}, new int[] {y2-radius,y2-radius,y2+radius,y2+radius}, 4);
		p3 = new Polygon(new int[] {x3-radius,x3+radius,x3+radius,x3-radius}, new int[] {y3-radius,y3-radius,y3+radius,y3+radius}, 4);
		p4 = new Polygon(new int[] {x4-radius,x4+radius,x4+radius,x4-radius}, new int[] {y4-radius,y4-radius,y4+radius,y4+radius}, 4);
		
		g.setColor(Color.CYAN);
		
//		g.drawPolygon(p1);
//		g.drawPolygon(p2);
//		g.drawPolygon(p3);
//		g.drawPolygon(p4);
		
		
		
		if(p1.getBounds().intersects(p2.getBounds()) || p1.getBounds().intersects(p3.getBounds()) || p1.getBounds().intersects(p4.getBounds()) || p2.getBounds().intersects(p3.getBounds()) || p2.getBounds().intersects(p4.getBounds()) || p3.getBounds().intersects(p4.getBounds())){
			
			
			
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, getWidth(), getHeight());
			
		}
		
	}
	
	
	
	
	


}