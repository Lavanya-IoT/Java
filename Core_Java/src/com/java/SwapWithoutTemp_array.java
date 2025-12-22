package com.java;

import java.util.Scanner;

public class SwapWithoutTemp_array {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nEnter first index to swap:");
        int index1 = sc.nextInt();

        System.out.println("Enter second index to swap:");
        int index2 = sc.nextInt();

        // Swapping without temporary variable
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];

        System.out.println("Array after swapping (without temp variable):");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
