package com.canddella.utility;


public class PatternQ12 {
	
	public static void main(String[] args) {

		int n=3;
		int q=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}	
			for(int k=0;k<i;k++)
			{
				System.out.print(q+" ");
				q++;
			}
			System.out.println("");
		}

	}
		

}
