package com.more_Java;

import com.java_practice.JavaLoop;

public class ToRunCode {
	static int id = 100;
	String x;
	
	ToRunCode(String x){
		this.x=x;
	}
	
	ToRunCode() {
		System.out.println("I am the non parameterized construuctor");
	}
	
	void idGen() {
		id=id+1;
		System.out.println(x+"'s ID id : "+id);
	}


	public static void main(String[] args) {
		
		JavaLoop ab = new JavaLoop();
		
	}

}
