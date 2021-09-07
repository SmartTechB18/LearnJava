package com.more_Java;

public class MethodOverloading {
	
	void method() {
		System.out.println("I am the first");
	}
	
	void method(int a, int b) {
		int c =a+b;
		System.out.println(c);
	}

	void method(String c) {	
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.method("Shams");
	}

}
