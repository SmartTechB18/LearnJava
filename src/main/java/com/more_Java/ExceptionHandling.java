package com.more_Java;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		String name = "Mohammed";	
		int x =3;
		int y = 0;
		int [] a = {10,30,20,40,5};
		try {
			
			System.out.println(a[10]);
		}	
		
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am the finally block");
		}
		
		
		
		System.out.println(a[2]);
		
		System.out.println("This is what I have...");
	}

}
