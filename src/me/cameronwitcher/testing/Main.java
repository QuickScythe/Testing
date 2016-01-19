package me.cameronwitcher.testing;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Main {
	
	
	public static void main(String[] args){
		JFrame frame = new JFrame("test");
		frame.pack();
		frame.setSize(600, 600);
		frame.setVisible(true);
		

		
		frame.add(new Panel());
		
		
		
	}
}