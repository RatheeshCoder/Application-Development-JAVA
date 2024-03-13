package com.MIT1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		 String str = scanner.nextLine();
	        String revstr = "";

	        int len = str.length();

	        
	        for (int i = len - 1; i >= 0; i--) {
	            revstr += str.substring(i, i + 1);
	        }
	        System.out.println("The reverse of given " +str+ "is : " +revstr);
	    }

}




