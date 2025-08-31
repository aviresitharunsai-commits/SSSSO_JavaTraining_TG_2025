package com.sssso.training.exercises20250726;

public class Compound_intrest {
	public static void main(String[] args) {
        double principle = 10000;
        double rate = 5;
        double time = 2;

        double simpleInterest = (principle * rate * time) / 100;
        double compoundInterest = principle * (Math.pow((1 + rate / 100), time)) - principle;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }

}
