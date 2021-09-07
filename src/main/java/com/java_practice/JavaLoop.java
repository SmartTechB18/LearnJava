package com.java_practice;

public class JavaLoop {
	
	void start() {
		
	for(int i=1; i<=100; i++) {
		if(i%5==0 && i%3==0) {
			System.out.println("FizzFuzz");
		}
		else if(i%5==0) {
		System.out.println("Fizz");
		}
		else if(i%3==0) {
			System.out.println("Fuzz");
		}
		else {System.out.println(i);}
	}
	
	
	}
	
	public static void main(String[] args) {
		JavaLoop obj = new JavaLoop();
		obj.start();
	}

}
