package com.canddella.utility;

import java.util.Scanner;
//19. Program to count the occurrence of the given character in a string and replace it with a new
//character?

public class ArrayQ19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string:");
		String word= scanner.nextLine();
		int count=0;
		System.out.println("Enter character:");
		char ch = scanner.next().charAt(0);
		for(int i=0;i<word.length();i++)
		{
			if(ch==word.charAt(i))
				count++;
		}
		System.out.println("No of occurrences of "+ch+": "+count);
		System.out.println("Enter character to replace:");
		System.out.println(word.replace(ch, scanner.next().charAt(0)));
			
	}
}
