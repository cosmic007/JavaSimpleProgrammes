package com.canddella.utility;

import java.util.Scanner;

public class PatternQ11 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the limit:");
		
		int n= scanner.nextInt();
		int p=n;
		
		for(int i=0;i<n;i++)
		{
			for(int j=p;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
			p--;
		}
	}
		

}
