package com.canddella.utility;

import java.util.Scanner;

//4. Calculate the sum of the series

public class SumOfSeries2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=scanner.nextInt();
		int sum=0;
		int a=0;
		int b=1;
		int p=1;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(p);
			sum=sum+p*p*p;
			p=a+b;
			a=b;
			b=p;	
		}
		System.out.println(sum);

	}

}
