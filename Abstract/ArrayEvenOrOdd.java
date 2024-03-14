package Abstract;

import java.util.Scanner;

public class ArrayEvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to create: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number (" + (i+1) + "): ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Entered array is:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nOdd: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
        }
        
        System.out.println("\nEven: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
