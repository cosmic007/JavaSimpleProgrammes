package com.canddella.utility;

import java.util.Scanner;
//18. Find the duplicates and remove it from the array

public class ArrayQ18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		int temp;
		int flag=0;
		System.out.println("Enter elements:");
		
		int arrayList[] = new int[20];
		for(int i=0;i<n;i++)
			arrayList[i]=scanner.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arrayList[i]==arrayList[j])
					arrayList[j]=0;
			}

		}
		for(int i=0;i<n;i++)
		{
			if(arrayList[i]!=0)
				System.out.print(arrayList[i]+",");
	
		}
		
	}


}
