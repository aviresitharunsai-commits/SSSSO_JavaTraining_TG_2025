package com.sssso.training.exercises.arrays20250802;

import java.util.Scanner;

public class Librarytracker{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] lateDays = new int[6];
        int total = 0;
        for (int i = 0; i < lateDays.length; i++) {
            System.out.print("Enter days late for book " + (i + 1) + ": ");
            lateDays[i] = input.nextInt();
            total += lateDays[i];
        }
        double average = (double) total / lateDays.length;
        System.out.println("Average late days: " + average);
    }
}