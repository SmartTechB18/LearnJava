package com.java_practice;

public class StaticMethod {
	StaticMethod(){
		System.out.println();
	}
	
	void normal() {
		System.out.println("I am method");
	}
	
	void normal2() {
		StaticMethod obj = new StaticMethod();
		obj.normal();
	}
	
	static void stMe() {
		System.out.println("I am method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod obj = new StaticMethod();
		obj.normal();
		obj.normal2();
		
		StaticMethod.stMe();  // constructor is not executing

	}

}
