package com.canddella.utility;

import java.util.Scanner;

public class ArrayQ17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		int sum=0;
		System.out.println("Enter elements:");
		
		int arrayList[] = new int[20];
		for(int i=0;i<n;i++)
			arrayList[i]=scanner.nextInt();	
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arrayList[i]+arrayList[j]==8)
				{
					System.out.println(arrayList[i]+","+arrayList[j]);
					for(int k=j+1;k<n;k++)
					{
						if(arrayList[j]==arrayList[k])
							arrayList[k]=0;
					}
				}
				
			}
		}
	
	}

}
