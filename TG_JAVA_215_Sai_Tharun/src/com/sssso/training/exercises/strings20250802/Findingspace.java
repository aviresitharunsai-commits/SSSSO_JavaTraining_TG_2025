package com.sssso.training.exercises.strings20250802;

import java.util.Scanner;

public class Findingspace {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name.indexOf(" "));
    }

}
