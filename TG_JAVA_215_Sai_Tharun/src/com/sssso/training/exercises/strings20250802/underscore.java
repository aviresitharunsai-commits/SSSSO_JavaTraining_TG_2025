package com.sssso.training.exercises.strings20250802;

import java.util.Scanner;

public class underscore {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String recipe = input.nextLine();
        System.out.println(recipe.replace("_", " "));
    }

}
