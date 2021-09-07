package com.java_practice;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long number = 12345;
		long last_digit = 0;
		long sum = 0;
	    
		while(number>0){
	    last_digit = number%10;
	    number = number/10;
	    sum = sum*10 + last_digit;
	    }
	    
	   System.out.println("Reverse number is : "+sum);

	}

}
