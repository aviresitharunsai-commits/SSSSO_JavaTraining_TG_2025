package com.sssso.training.exercises.strings20250802;

import java.util.Scanner;

public class codegenerator {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String product = input.nextLine();
        if (product.length() >= 3) {
            System.out.println(product.substring(0, 3));
        } else {
            System.out.println(product);
        }
    }

}
