package com.Looping;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();

        System.out.print("Fibonacci series up to " + limit + ": ");
        generateFibonacciSeries(limit);

        scanner.close();
    }

    public static void generateFibonacciSeries(int limit) {
        int first = 0, second = 1;

        System.out.print(first + ", " + second);

        while (true) {
            int next = first + second;

            if (next > limit) {
                break;
            }

            System.out.print(", " + next);
            first = second;
            second = next;
        }

       
    }
}
