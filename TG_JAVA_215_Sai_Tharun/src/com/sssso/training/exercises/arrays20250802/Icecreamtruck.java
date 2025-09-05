package com.sssso.training.exercises.arrays20250802;

import java.util.Scanner;
import java.util.Arrays;

public class Icecreamtruck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] flavors = {"Vanilla", "Chocolate", "Strawberry", "Mint", "Cookies & Cream"};
        int[] scoops = new int[5];
        for (int i = 0; i < flavors.length; i++) {
            System.out.print("Enter scoops sold for " + flavors[i] + ": ");
            scoops[i] = input.nextInt();
        }
        for (int i = 0; i < scoops.length - 1; i++) {
            for (int j = i + 1; j < scoops.length; j++) {
                if (scoops[j] > scoops[i]) {
                    int temp = scoops[i];
                    scoops[i] = scoops[j];
                    scoops[j] = temp;
                    String t = flavors[i];
                    flavors[i] = flavors[j];
                    flavors[j] = t;
                }
            }
        }
        for (int i = 0; i < flavors.length; i++) {
            System.out.println(flavors[i] + ": " + scoops[i]);
        }
    }
}