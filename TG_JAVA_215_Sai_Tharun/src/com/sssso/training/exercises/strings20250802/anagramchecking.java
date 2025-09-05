package com.sssso.training.exercises.strings20250802;

import java.util.Arrays;
import java.util.Scanner;

public class anagramchecking {
	Scanner input = new Scanner(System.in);
    String word1 = input.nextLine();
    String word2 = input.nextLine();
    char[] a = word1.toLowerCase().toCharArray();
    char[] b = word2.toLowerCase().toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    if (Arrays.equals(a, b)) {
        System.out.println("Anagram");
    } else {
        System.out.println("Not an Anagram");
    }
  }
}

