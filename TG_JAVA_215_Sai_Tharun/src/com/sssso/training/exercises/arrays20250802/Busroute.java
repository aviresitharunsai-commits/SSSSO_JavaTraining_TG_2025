package com.sssso.training.exercises.arrays20250802;

import java.util.Scanner;

public class Busroute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] stops = new int[8];
        int total = 0;
        for (int i = 0; i < stops.length; i++) {
            System.out.print("Enter passengers at stop " + (i + 1) + ": ");
            stops[i] = input.nextInt();
            total += stops[i];
        }
        System.out.println("Total passengers: " + total);
    }
}