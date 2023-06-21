package com.canddella.utility;

import java.util.Scanner;

//5. Calculate the sum of the series

public class SumOfSeries3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=scanner.nextInt();
		
		int sum=0;
		int j=1;
		int k=1;
		int p=1;
		
		for(int i=1;i<=n;i++)
		{
			p=j;
			if(k%2!=0)
			{
				sum=sum+changePower(j,i);
			}
			else
			{
				sum=sum-changePower(j,i);
			}
			j=j+2;	
			k++;	
		}
		System.out.println(sum);
	}
	public static int changePower(int n,int p)
	{
		int q=1;
		for(int i=0;i<p;i++)
		{
			q=q*n;	
		}
		return q;
	}

}
