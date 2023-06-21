package com.canddella.utility;

import java.util.Scanner;
//17. Program to find the numbers that add up to a sum of 8 in an array.

public class ArrayQ17_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		System.out.println("Enter elements:");
		
		int arrayList[] = new int[20];
		for(int i=0;i<n;i++)
			arrayList[i]=scanner.nextInt();	
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arrayList[i]+arrayList[j]==8)
					System.out.println(arrayList[i]+","+arrayList[j]);
			}
		}
			
	}

}
