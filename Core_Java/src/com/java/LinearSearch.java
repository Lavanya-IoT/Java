package com.java;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = {3, 5, 7, 9, 11};

        System.out.println("Enter the number:");
        int key = sc.nextInt();

        boolean found = false;
        int idx = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                found = true;
                idx = i;
                break;
            }
        }

        if (found) {
            System.out.println("Key found at index " + idx);
        } else {
            System.out.println("Key not found");
        }

        sc.close();
    }
}

