package me.cameronwitcher.testing;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args){
		if(args[0].equalsIgnoreCase("testing")){
			for(int x=0;x!=641;x++){
				for(int y=0;y!=641;y++){
					System.out.println(x + ":" + y);
				}
			}
		}
		
	}
}