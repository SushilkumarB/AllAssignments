package com.thinkitive;

public class FirstLetterWord {

	public static void main(String[] args) {
		
		String s = "how are you mate?";
		
		 String words[]= s.split(" ");  
		 String capitalizeWord="";  
		    
		 for(String w:words){  
		        String first=w.substring(0,1);  
		        String afterfirst=w.substring(1);  
		        capitalizeWord+=first.toUpperCase()+afterfirst+" "; 
		
		}
		
		System.out.println(capitalizeWord);
	}

}
