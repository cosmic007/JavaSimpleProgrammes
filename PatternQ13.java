package com.canddella.utility;

public class PatternQ13 {

	public static void main(String[] args) {	
		int p=1;
		int m=2;
		for(int i=1;i<=6;i++)	
		{
			for(int k=4-i;k>0;k--)
			{
				System.out.print(" ");
			}
			if(i>3)
			{
				for(int k=i-2;k>0;k--)
				{
					System.out.print(" ");
				}	
			}
			for(int j=1;j<=p;j++)
			{
				System.out.print("*");
			
			}
				
			System.out.println("");
			p=p+m;
			if(p==5)
			{
				m=m*-1;	
			}
	
		}
	}
}
