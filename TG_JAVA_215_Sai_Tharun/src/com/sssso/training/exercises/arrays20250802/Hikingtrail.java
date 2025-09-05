package com.sssso.training.exercises.arrays20250802;

import java.util.Scanner;

public class Hikingtrail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] elevation = new int[10];
        for (int i = 0; i < elevation.length; i++) {
            System.out.print("Enter elevation at point " + (i + 1) + ": ");
            elevation[i] = input.nextInt();
        }
        for (int i = 0; i < elevation.length - 1; i++) {
            if (Math.abs(elevation[i] - elevation[i + 1]) > 50) {
                System.out.println("Steep section between points " + (i + 1) + " and " + (i + 2));
            }
        }
    }
}
