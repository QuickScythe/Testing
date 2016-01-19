package me.cameronwitcher.testing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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

	public Panel() {
		
		initBoard();
	}

	public void initBoard() {

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
		for(int y=0;y!=10;y++){
			for(int x=0;x!=10;x++){
				String[] l = Main.map.get(y).split(":");
				switch(l[x]){
				case "B":
					g.setColor(Color.BLUE);
					break;
				case "R":
					g.setColor(Color.RED);
					break;
				default:
					g.setColor(Color.BLACK);
					break;
				}
				
				
				
				g.fillRect(x*60, y*60, 60, 60);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
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
