package com.more_Java;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] f = new int[3];
		
		
		int[] a = {10,30,50,20,80,70,40,100,150,120,130,110};
		
		int x = Arrays.stream(a).max().getAsInt();
		System.out.println("Highest with method"+x);		
		int max = 0;
		
		for(int i=0; i<a.length; i++) {
				if(a[i]<max) {
					max=a[i];					
				}			
		}
		System.out.println("Highest number without method"+max);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
			}
		
		int z =0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					z = a[j];
					a[j] = a[i];
					a[i] =z;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
			}
	}

}
