package com.canddella.utility;

import java.util.Scanner;

//14. Program to count the frequency of an element of an array.

public class ArrayQ14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		int count=0;
		System.out.println("Enter elements:");
		
		int arrayList[] = new int[20];
		for(int i=0;i<n;i++)
			arrayList[i]=scanner.nextInt();	
		
		System.out.println("Enter the required element:");
		int s=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arrayList[i]==s)
				count++;
		}
		System.out.println("Frequency="+count);
	
	}

}
