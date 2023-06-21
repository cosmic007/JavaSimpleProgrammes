package com.canddella.utility;

import java.util.Scanner;

//15. Program to sort an array in ascending and descending order.

public class ArrayQ15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=scanner.nextInt();
		
		int numList[] = new int[n];
		
		System.out.println("Enter elements:");
		
		for(int i = 0;i<n;i++)
		{
			numList[i]=scanner.nextInt();
			
		}
		
		
		System.out.println("Ascending Order:");
		for(int j =0;j<n;j++)
		{
			for(int i= 0;i<n-1;i++)
			{
				if(numList[i]>numList[i+1])
				{
					int temp=numList[i];
					numList[i]=numList[i+1];
					numList[i+1]=temp;
				}
			}
			
		}
		
		for(int i = 0;i<n;i++)
		{
			System.out.println(numList[i]);
			
		}
		
		System.out.println("Descending Order:");
		for(int j =0;j<n;j++)
		{
			for(int i= 0;i<n-1;i++)
			{
				if(numList[i]<numList[i+1])
				{
					int temp=numList[i];
					numList[i]=numList[i+1];
					numList[i+1]=temp;
				}
			}
			
		}
		
		for(int i = 0;i<n;i++)
		{
			System.out.println(numList[i]);
			
		}

	}

}
