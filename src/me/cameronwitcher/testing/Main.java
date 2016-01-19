package me.cameronwitcher.testing;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Main {
	
	public static List<String> map = new ArrayList<>();	
	
	public static void main(String[] args){
		JFrame frame = new JFrame("test");
		frame.pack();
		frame.setSize(600, 600);
		frame.setVisible(true);
		
		Main.map.add("R:B:B:B:B:B:B:B:B:B");
		Main.map.add("B:R:B:B:B:B:B:B:B:B");
		Main.map.add("B:B:R:B:B:B:B:B:B:B");
		Main.map.add("B:B:B:R:B:B:B:B:B:B");
		Main.map.add("B:B:B:B:R:B:B:B:B:B");
		Main.map.add("B:B:B:B:B:R:B:B:B:B");
		Main.map.add("B:B:B:B:B:B:R:B:B:B");
		Main.map.add("B:B:B:B:B:B:B:R:B:B");
		Main.map.add("B:B:B:B:B:B:B:B:R:B");
		Main.map.add("B:B:B:B:B:B:B:B:B:R");
		
		frame.add(new Panel());
		
		
		
	}
}