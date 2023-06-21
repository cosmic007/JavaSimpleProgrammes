package com.canddella.utility;

import java.util.Scanner;

//2. Program to arrange four numbers in ascending and descending order
public class AscDescFourNum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter four numbers:");
		
		int numList[] = new int[10];
		
		for(int i = 0;i<4;i++)
		{
			numList[i]=scanner.nextInt();
		}
		
		System.out.println("Ascending Order:");
		for(int j =0;j<4;j++)
		{
			for(int i= 0;i<3;i++)
			{
				if(numList[i]>numList[i+1])
				{
					int temp=numList[i];
					numList[i]=numList[i+1];
					numList[i+1]=temp;
				}
			}
		}
		
		for(int i = 0;i<4;i++)
		{
			System.out.println(numList[i]);	
		}
		
		System.out.println("Descending Order:");
		for(int j =0;j<4;j++)
		{
			for(int i= 0;i<3;i++)
			{
				if(numList[i]<numList[i+1])
				{
					int temp=numList[i];
					numList[i]=numList[i+1];
					numList[i+1]=temp;
				}
			}
		}
		
		for(int i = 0;i<4;i++)
		{
			System.out.println(numList[i]);
		}	
	}
}
