package com.java_practice;

public class SalesProblem {

	public static void main(String[] args) {	
		int jan = 6;
		int feb = 9;
		int mar = 7;
		
		int [] sales = {6,9,7,10,11,9,7,12,14,15,13,11};
	//	int total = sales[0]+sales[1]..--------->+sales[11];
		System.out.println(sales.length);
		int total = 0;
		for(int i=0; i<sales.length; i++) {
			total = total+sales[i];
		}
	System.out.println("Toatal sales : "+total);
	
	double avg = (double)total/sales.length;
	System.out.println("Average sales : "+avg);
	
	int gta = 0;
	for(int i=0; i<sales.length; i++) {
		if(sales[i]>avg) {
			gta = gta + 1;   //  gta++;
		}
	}	
	System.out.println("Number of month where sales is above avg :"+gta);
	}
	
	
}
