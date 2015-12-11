package me.cameronwitcher.testing;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Testing");
		frame.pack();
		frame.setSize(600, 600);
		frame.setVisible(true);
		Pane pane = new Pane();
		frame.add(pane);
	}

}
