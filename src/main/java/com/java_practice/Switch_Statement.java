package com.java_practice;

public class Switch_Statement {
	
	void passEntry(int passwCode) {
		 
		switch (passwCode) {	
		case 001: 	System.out.println("Welcome. Study hard");
		   			 break;
		case 002:	System.out.println("Welcome. Teach well");
		    			break;
		case 003:	System.out.println("Welcome. Do not make any mistake");
					break;
		default:System.out.println("Get out of here");	}
	}

	public static void main(String[] args) {
		Switch_Statement pass = new Switch_Statement();
		pass.passEntry(034);
		
		

	}

}
