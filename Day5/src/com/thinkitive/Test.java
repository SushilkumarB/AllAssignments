package com.thinkitive;

public class Test {
	
	public static void main(String[] args) {
		
		hello();
		}
	
	public static void hello() {
		
		int age = 22;
		if (age > 18 && age < 35) {
			System.out.println("Admisssion Successfull...");
		}else {
			
			InvalidAgeException i = new InvalidAgeException();
			throw i;
			
		}
	}
}
