package com.CodingPractice;

import java.util.Arrays;

public class AngramString {	
	String s1 = null;
	String s2 = null;
	boolean angram = true;
	
	AngramString(String w1, String w2){
		this.s1 = w1.replace(" ", "");
		System.out.println(s1);
		this.s2 = w2.replace(" ", "");
		System.out.println(s2);	
		if(s1.length()!=s2.length()) {
			angram = false;
		}
	}
	
	void TestStringAngram() {
		
		
	if(angram=true) {
		
		char[] a1 = s1.toLowerCase().toCharArray();
		char[] a2 = s2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(Arrays.equals(a1, a2)) {
			System.out.println(s1+" and "+s2+" is angram.");
		}
		else {
			System.out.println("Not an angram. Try again...!");
		}	
	}	
	
	}	

	public static void main(String[] args) {
		AngramString abc = new AngramString("Maa m ", " M  a ma ");
		abc.TestStringAngram();
	}

}
