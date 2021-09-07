package com.more_Java;

public class ConstructorTest {
	
	String name1 = "Z  ai  f";
	String name2 = "S  aif ";
	
	ConstructorTest(){
		if(name1.contains("i")) {
			String convert = name1.replaceAll(" ", "");
			System.out.println(convert);
		System.out.println("test pass");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTest a = new ConstructorTest();

	}

}
