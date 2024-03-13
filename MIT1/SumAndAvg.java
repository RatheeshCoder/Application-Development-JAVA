package com.MIT1;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the number :");
		int n = scanner.nextInt();
		double sum=0;
		double Avg = 0;
		
		for(int i=1;i<=n;i++) {
			System.out.print("Enter the value for " +i+ "::");
			int newnum = scanner.nextInt();
			sum += newnum;
		}
		
		Avg = sum/n;
		
		System.out.println("The Avg of given number is :" +Avg);
		
	}

}
