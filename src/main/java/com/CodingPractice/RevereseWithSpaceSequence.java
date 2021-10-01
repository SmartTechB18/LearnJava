package com.CodingPractice;

public class RevereseWithSpaceSequence {
	// input = My name is Mohammed      output:  demmahoM si eman yM
	// input = My name is Mohammed      output:  de mmah oM isemanyM
	
	static void revStr(String x) {
		StringBuffer sb = new StringBuffer(x);
		String reverse = sb.reverse().toString();	
		System.out.println(x+"  -->  "+reverse);
	}
	
	static void revWithSpsSeq(String x) {
		String noSpace = x.replaceAll(" ", "");
		StringBuffer sb = new StringBuffer(noSpace);
		String reverse = sb.reverse().toString();
		
		char[] revArray = reverse.toCharArray();
		char[] result = new char[x.length()];
		System.out.println("Input");
		System.out.println(x);
		
		System.out.println("Output");
		int j=0;
		for(int i=0; i<x.length(); i++) {
			
			if(x.charAt(i)==' ') {
				result[i] = ' ';
			}
			
			else if(x.charAt(i)!=' ') {
				result[i]=revArray[j];
				j++;
			}
			System.out.print(result[i]);
		}
	}
	
	public static void main(String[] args) {
		RevereseWithSpaceSequence.revWithSpsSeq("My name is Mohammed");
	}

}
