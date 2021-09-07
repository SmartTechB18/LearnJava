package com.java_practice;

import java.util.Arrays;
import java.util.Collections;

public class Casting {
 public static void main(String[] args) {

	 int [] a = {10,40,60,30,20,50,80,90,70};
	 
	 int less;
	 for(int i=0; i<a.length; i++) {
		 for(int j=i+1; j<a.length; j++) {
			 if(a[i]>a[j]) {
				 less = a[i];
				 a[i] = a[j];
				 a[j] = less; 
			 }
		 }
	 }
	 
	 for(int i=0; i<a.length; i++) {
		 System.out.println(a[i]);
	 }
	 
	
	 int max=Arrays.stream(a).max().getAsInt();
	 System.out.println(max);
	 
	 int max1 = 0;
	 for(int i=0; i<a.length; i++) {
		 if(max1<a[i]) {
			 max1=a[i];
		 }
	 }
	System.out.println("maximum number "+max1);
}
}
