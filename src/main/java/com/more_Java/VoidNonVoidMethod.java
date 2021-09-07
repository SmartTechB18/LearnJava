package com.more_Java;

public class VoidNonVoidMethod {
	String x = "Mohammed";
	public void getSalary() {
		System.out.println("The salary is $ 100000");
	}
	
	public String getMoney() {
		return x;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidNonVoidMethod obj = new VoidNonVoidMethod();
		obj.getSalary();
		System.out.println();
		System.out.println(obj.getMoney());
	}

}
