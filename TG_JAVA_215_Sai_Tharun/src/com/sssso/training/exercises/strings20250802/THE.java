package com.sssso.training.exercises.strings20250802;

import java.util.Scanner;

public class THE {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        if (title.toLowerCase().startsWith("the")) {
            System.out.println("Starts with The");
        } else {
            System.out.println("Does not start with The");
        }
    }

}
