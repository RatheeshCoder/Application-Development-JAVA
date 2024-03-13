package com.MIT1;

import java.util.Scanner;

public class Patttern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int n = scanner.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if((j+i)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println(" " );
		}

	}

}
