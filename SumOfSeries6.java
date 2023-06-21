package com.canddella.utility;

import java.util.Scanner;
//8. Calculate the sum of the series

public class SumOfSeries6 {
	public static void main(String[] args) {
		
		SumOfSeries6 obj= new SumOfSeries6();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your limit:");
		int n=scanner.nextInt();
		double sum=0;
		
		for(int i=1;i<=n;i++)
		{
			double v=(double)i/(obj.changePower(i*i,i)+obj.factorial(i));
			sum=sum+v;
			
		}	
		System.out.println(sum);
		
	}
	public int factorial(int n) {
		int k=1;
		for(int i=n;i>0;i--)
		{
			k=k*i;
		}
		
		return k;
	}
	
	public int changePower(int n,int p)
	{
		int q=1;
		for(int i=0;i<p;i++)
		{
			q=q*n;	
		}
		return q;
	}

}
