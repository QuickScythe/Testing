package me.cameronwitcher.testing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Pane extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Timer timer;
	int x = 300;
	int y = 300;
	int x1 = 0;
	int y1 = 0;
	Polygon poly1 = new Polygon(new int[] {x1-10,x1+10,x1+10,x1-10}, new int[] {y1-10,y1-10,y1+10,y1+10}, 4);
	Polygon poly = new Polygon(new int[] {x-15,x+30,x+30,x-15}, new int[] {y-30,y-30,y+30,y+30}, 4);
	
	public Pane() {
		init();
	}

	private void init() {
		setPreferredSize(new Dimension(600, 600));
		setVisible(true);
		addKeyListener(new KListener());
		addMouseMotionListener(new MMListener());
		addMouseListener(new MListener());
		setFocusable(true);
		setBackground(Color.BLACK);
		timer = new Timer(15, this);
		timer.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		poly = new Polygon(new int[] {x-30,x+30,x+15,x-15}, new int[] {y-15,y-30,y+30,y+40}, 4);
		
		drawObjects(g);
		
	}

	private void drawObjects(Graphics g) {
		g.setColor(Color.red);
		g.drawPolygon(poly);
		g.setColor(Color.GREEN);
		
		g.drawRect(poly.getBounds().x, poly.getBounds().y, poly.getBounds().width, poly.getBounds().height);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}

	private class KListener extends KeyAdapter {

		@Override
		public void keyReleased(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
		}
	}

	private class MMListener extends MouseMotionAdapter {
		public void mouseMoved(MouseEvent e){
			x1 = e.getX();
			y1 = e.getY();
		}
		
	}

	private class MListener extends MouseAdapter {
		
	}

}
