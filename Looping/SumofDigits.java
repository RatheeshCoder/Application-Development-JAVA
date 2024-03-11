package com.Looping;

import java.util.Scanner;

public class SumofDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");

        int number = scanner.nextInt();

        int sumofDigits = calSumofDig(number);

        System.out.println("Sum of Digits of " + number + " is: " + sumofDigits);

        scanner.close();
    }

    public static int calSumofDig(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
}
