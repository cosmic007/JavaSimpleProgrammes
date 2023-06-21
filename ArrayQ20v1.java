package com.canddella.utility;

import java.util.Scanner;
import java.util.StringTokenizer;


//20. Program to count the number of words in a given string sentence.

public class ArrayQ20v1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String sentence= scanner.nextLine();
		String divider=" ";
		
		StringTokenizer token = new StringTokenizer(sentence,divider);
		System.out.println("No of words: "+token.countTokens());
			
	}
		
		

	

}
