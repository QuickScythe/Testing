package me.cameronwitcher.testing;

import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Panel extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Timer timer;
	Polygon poly;

	public Panel() {
		
		initBoard();
	}

	public void initBoard() {
		
		poly = new Polygon(new int[] {300+10,300-10,300-10,300+10}, new int[] {300+10,300+10,300-10,300-10}, 4);

		timer = new Timer(15, this);
		timer.start();

		addKeyListener(new TAdapter());
		addMouseMotionListener(new MMListener());
		addMouseListener(new MListener());
		

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawMenu(g);
		Toolkit.getDefaultToolkit().sync();
	}

	public void drawMenu(Graphics g) {
		g.drawLine(getCircleLocationX(), getCircleLocationY(), 300, 300);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	private void rotatePoly(){
		
	}

	private class TAdapter extends KeyAdapter {
	
		@Override
		public void keyReleased(KeyEvent event) {
			
			
			
		}

		@Override
		public void keyPressed(KeyEvent event) {
			
		}
	}

	private class MMListener extends MouseMotionAdapter {

		public void mouseMoved(MouseEvent e) {
			
		}
	}

	private class MListener extends MouseAdapter {
		
	}

}
