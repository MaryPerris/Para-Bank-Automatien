package com.util;

public class PracticeJavaLooping {
	
	String name="America";// Global(instance)
	
	public void getValue(){
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
	
	}

	}
public static void main(String[]args) {
	  
	
	PracticeJavaLooping obj = new PracticeJavaLooping();
	obj.getValue();
}
}


