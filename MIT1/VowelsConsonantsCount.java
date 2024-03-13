package com.MIT1;

import java.util.Scanner;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str = scan.nextLine();
		
		int i;
		int vowelsCount = 0;
		int consonantsCount = 0;
		
		int len  = str.length();
		str = str.toLowerCase();		
		for(i=0;i<len;i++) {
			char ch = str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
				vowelsCount++;
			}
			else {
				consonantsCount++;
			}
		}
		
		System.out.println("The count of vowels in " +str+ "is:" +vowelsCount);
		System.out.println("The count of consonants in " +str+ "is:" +consonantsCount);
	}

}
