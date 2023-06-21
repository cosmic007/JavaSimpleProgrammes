package com.canddella.utility;

import java.util.Scanner;

//6. Calculate the sum of the series 1/1! +2/2!+3/3!+.............+n!

public class SumOfSeries4 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your limit:");
		int n=scanner.nextInt();
		double sum=0;
		
		for(int i=1;i<=n;i++)
		{
			double v=(double)i/factorial(i);
			sum=sum+v;
			
		}	
		System.out.println(sum);
		
	}
	public static int factorial(int n) {
		int k=1;
		for(int i=n;i>0;i--)
		{
			k=k*i;
		}
		
		return k;
	}
	
	
	
	

}
