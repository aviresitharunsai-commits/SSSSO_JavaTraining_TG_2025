package com.sssso.training.exercises.strings20250802;

import java.util.Scanner;

public class reversewords {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        String word = input.nextLine();
	        String reversed = new StringBuilder(word).reverse().toString();
	        System.out.println(reversed);
	    }

}
