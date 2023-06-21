package com.canddella.utility;

import java.util.Scanner;

//20. Program to count the number of words in a given string sentence.

public class ArrayQ20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String sentence= scanner.nextLine();
		int count=0;
		boolean isWord=false;
		int end = sentence.length()-1;
		
		
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)!=' ' && i!=end )
				isWord=true;
			else if(sentence.charAt(i)==' ' && isWord==true)
			{
				count++;
				isWord=false;	
			}
			else if(sentence.charAt(i)!=' '&& i==end)
				count++;
			
		}
		System.out.println("No of words:"+count);
		
		
		
		
			
	}
		
		

	

}
