package com.canddella.utility;

import java.util.Scanner;

public class PatternQ9 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the limit:");
		
		int n= scanner.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
	}
		

}
