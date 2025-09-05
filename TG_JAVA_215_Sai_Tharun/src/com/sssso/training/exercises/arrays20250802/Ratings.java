package com.sssso.training.exercises.arrays20250802;

import java.util.Scanner;

public class Ratings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ratings = new int[6];
        for (int i = 0; i < ratings.length; i++) {
            System.out.print("Enter rating for movie " + (i + 1) + ": ");
            ratings[i] = input.nextInt();
        }
        int max = ratings[0];
        int movie = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > max) {
                max = ratings[i];
                movie = i + 1;
            }
        }
        System.out.println("Highest rating is " + max + " for movie " + movie);
    }
}
