package com.java_practice;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		// less than 40 = fail; if less than 65 but more than 40=b; more than 65 a
		int marks = -110;
		if(marks>=0 && marks<40) {
			System.out.println("Fail");
		}
		else if(marks>=40 && marks<65) {
			System.out.println("Pass and got B grade");
		}
		else if(marks<=100 && marks>=65) {
			System.out.println("Passed with grade A");
		}
		else {
			System.out.println("Error: Please. recheck the marks");
		}
	}
	
}
