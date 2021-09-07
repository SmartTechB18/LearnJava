package com.java_practice;

public class StringFirst {

	public static void main(String[] args) {
		

		String x = "I love java so much. Its only love. its 100% love. So this is love. Trust me its love.";
		//how many words are in the country
		String y = x.replace(".", "");
		String [] a = y.split(" ");
		System.out.println(y);			
		
		int counter = 0;
	for(int i=0; i<a.length; i++) {
		if(a[i].equals("love")) {
			counter = counter + 1;  //counter++;
		}
	}
	System.out.println(counter);
	
	String b = y.replaceAll("love", "hate");
	String [] z = b.split(" ");
	
	counter = 0;
	for(int i=0; i<a.length; i++) {
		if(z[i].equals("hate")) {
			counter = counter + 1;  //counter++;
		}
	}
	System.out.println(b);
	System.out.println(counter);
	
	String firstName = "Nirob";
	String lastName = "Hossen";
	System.out.println(firstName+lastName);
	System.out.println(lastName);
	String together = firstName.concat(lastName);
	System.out.println(together);
	}
	
	

}
