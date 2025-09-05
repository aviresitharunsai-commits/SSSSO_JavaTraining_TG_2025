package com.sssso.training.exercises.arrays20250802;

import java.util.Scanner;

public class Foodtruckrevenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] revenue = new int[14];
        int count = 0;
        for (int i = 0; i < revenue.length; i++) {
            System.out.print("Enter revenue for day " + (i + 1) + ": ");
            revenue[i] = input.nextInt();
            if (revenue[i] > 300) {
                count++;
            }
        }
        System.out.println("Days above $300: " + count);
    }
}
