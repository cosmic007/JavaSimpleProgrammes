package com.canddella.utility;

import java.util.Scanner;

public class PatternQ10 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the limit:");
		
		int n= scanner.nextInt();
		
		String s="  ";
		char p='B';
		
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i-1;j++)
			{
				System.out.print(s);
			}
			for(char k='A';k<p;k++)
			{
				System.out.print(k+" ");
			}
			p++;
			System.out.println("");
			
		
		}
	}
		
}
