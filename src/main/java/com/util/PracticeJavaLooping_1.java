package com.util;

public class PracticeJavaLooping_1 {

	
		String beforeReverse = "America";// Global instance
        String afteRreverse="";
     
        public void getValue() {
        	System.out.println("Before reverse = "+beforeReverse);
        	for(int i=beforeReverse.length()-1;i>=0;i--) {
        	 System.out.println(beforeReverse + beforeReverse.charAt(i));
        // afteRreverse+= beforeReverse.charAt(i);
   
        	}
        	
        	System.out.println("After reverse = "+afteRreverse);
        	
        	
        	if(beforeReverse.equals(afteRreverse)) {
        		System.out.println("this is pallindrome");
        	}else {
        		System.out.println("this is not pallindrome");
        	}
        }
        
 	public static void main(String[] args) {
		
 		PracticeJavaLooping_1 obj = new PracticeJavaLooping_1();
 		
 			obj.getValue();//
 				
	}
}
