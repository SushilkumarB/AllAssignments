package com.thinkitive;

public class FirstLetterCapitalize {
	public static void main(String[] args) {
		
		String s = "abcdefg";
		
		String firstLetter = s.substring(0,1);
		String remainingLetter = s.substring(1,s.length());
		
		firstLetter = firstLetter.toUpperCase();
		
		String word = firstLetter + remainingLetter;
		
		System.out.println(word);
		
		
		
	}

}
