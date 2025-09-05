package com.sssso.training.exercises.arrays20250802;

import java.util.Scanner;
import java.util.ArrayList;

public class GardenSize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] plots = new int[15];
        int total = 0;
        for (int i = 0; i < plots.length; i++) {
            System.out.print("Enter size of plot " + (i + 1) + ": ");
            plots[i] = input.nextInt();
            total += plots[i];
        }
        double average = (double) total / plots.length;
        ArrayList<Integer> larger = new ArrayList<>();
        for (int p : plots) {
            if (p > average) {
                larger.add(p);
            }
        }
        System.out.println("Plots larger than average: " + larger);
    }
}