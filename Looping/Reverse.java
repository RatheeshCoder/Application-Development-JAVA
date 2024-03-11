package com.Looping;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rev = 0;
       
		System.out.println("Enter the number :");
		int num = scanner.nextInt();
		
		while(num!=0) {
			int rem = num%10;
			
			rev = rev*10+rem;
			num = num/10;
		}
		
		System.out.println("The Reverse of given " +num+ "is " +rev);
		

	}

}
