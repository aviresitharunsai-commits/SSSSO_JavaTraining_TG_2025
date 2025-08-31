package com.sssso.training.exercises20250726;

public class Swap_variables {
	public static void main(String[] args) {
        int x = 10;
        int y = 30;

        System.out.println("swap 1: x = " + x + " y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("swap 2- x = " + x + " y = " + y);
    }

}
