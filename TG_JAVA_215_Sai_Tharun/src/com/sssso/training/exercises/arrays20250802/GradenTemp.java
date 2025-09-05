package com.sssso.training.exercises.arrays20250802;

import java.util.Scanner;

public class GradenTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] temps = new int[7];
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = input.nextInt();
        }
        int bestDay = 1;
        int closest = Math.abs(temps[0] - 22);
        for (int i = 1; i < temps.length; i++) {
            int diff = Math.abs(temps[i] - 22);
            if (diff < closest) {
                closest = diff;
                bestDay = i + 1;
            }
        }
        System.out.println("Closest to 22°C on day " + bestDay);
    }
}