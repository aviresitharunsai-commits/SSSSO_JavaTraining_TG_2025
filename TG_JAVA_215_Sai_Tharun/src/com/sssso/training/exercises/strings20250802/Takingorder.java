package com.sssso.training.exercises.strings20250802;

import java.util.Scanner;

public class Takingorder {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        String order = input.nextLine();
	        if (order.toLowerCase().contains("vanilla")) {
	            System.out.println("Special drink found");
	        } else {
	            System.out.println("Not the special drink");
	        }
	    }

}
