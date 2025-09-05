package com.sssso.training.exercises.arrays20250802;

import java.util.Scanner;

public class Petstoresales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] animals = {"Dogs", "Cats", "Birds", "Fish"};
        int[] sales = new int[4];
        for (int i = 0; i < animals.length; i++) {
            System.out.print("Enter number of " + animals[i] + " sold: ");
            sales[i] = input.nextInt();
        }
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i] + ": " + sales[i]);
        }
    }
}