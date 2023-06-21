package com.canddella.utility;

import java.util.Scanner;
//16. Program to count the occurrence of all numbers in an array eg {1,2,1,3,4,1}

public class ArrayQ16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		int count=0;
		int k;
		int flag;
		System.out.println("Enter elements:");
		
		int arrayList[] = new int[20];
		for(int i=0;i<n;i++)
		{
			
			arrayList[i]=scanner.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			k=arrayList[i];
			count=0;
			flag=0;
			for(int j=0;j<n;j++)
			{
				if(arrayList[j]==k)
				{
					count++;
					if(flag!=0)
					{
						arrayList[j]=0;
					}
					flag++;
				}
			}
			if(arrayList[i]!=0)
			{
				System.out.println("Occurrence of "+arrayList[i]+":"+count);
				
			}
		
		}
		
	}

}
