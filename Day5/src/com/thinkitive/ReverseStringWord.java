package com.thinkitive;

public class ReverseStringWord {

	public static void main(String[] args) {
		
		String s = "abcdefg";
		
		 String output = "";

		    for (int i = s.length() - 1; i >= 0; i--) {
		        output = output + s.charAt(i);
		    }

		   System.out.println(output);

	}

}
