package com.Looping;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		
		System.out.println("Enter the number :");
		int n = scanner.nextInt();
		
		
		if(n==0 || n==1) {
			System.out.println("The Given Number is not a Prime Number");
		}
		else {
			for (int i=0;i<n;i++) {
				if(n%2==0) {
					flag = true;
					break;
				}
			}
		}
		
		if(!flag) {
			System.out.println("The Given Number " +n+" is  a Prime Number");
		}
		else {
			System.out.println("The Given Number " +n+ " is not a Prime Number");
		}
		
		
		

	}

}
