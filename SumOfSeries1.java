package com.canddella.utility;

import java.util.Scanner;
//3. Calculate the sum of the series 1-3+5-7+....+n

public class SumOfSeries1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=scanner.nextInt();
		int sum=0;
		int j=1;
		int k=1;
		int p=1;
		
		for(int i=0;i<n;i++)
		{
			p=j;
			if(k%2!=0)
				sum=sum+j;
			else
				sum=sum-j;
			j=j+2;	
			k++;
		}
		System.out.println(sum);
	
	}
	
}
