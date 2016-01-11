package me.cameronwitcher.testing;

public class Main {
	
	public static void main(String[] args){
		if(args[0].equalsIgnoreCase("testing")){
			for(int x=0;x!=64;x++){
				for(int y=0;y!=64;y++){
					System.out.println(x + ":" + y);
				}
			}
		}
		
	}
}