package com.sssso.training.exercises.classes_objects20250809;

import java.util.Scanner;

class Recipe {
    String name;
    int originalServings;
    double ingredientAmount;

    Recipe(String name, int originalServings, double ingredientAmount) {
        this.name = name;
        this.originalServings = originalServings;
        this.ingredientAmount = ingredientAmount;
    }

    double calculateForServings(int newServings) {
        return (ingredientAmount / originalServings) * newServings;
    }
}

public class IngredientCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter recipe name: ");
        String name = input.nextLine();
        System.out.print("Enter original servings: ");
        int servings = input.nextInt();
        System.out.print("Enter ingredient amount (for original servings): ");
        double amount = input.nextDouble();

        Recipe recipe = new Recipe(name, servings, amount);

        System.out.print("Enter new servings: ");
        int newServings = input.nextInt();

        double newAmount = recipe.calculateForServings(newServings);
        System.out.println("You need " + newAmount + " units of ingredient for " + newServings + " servings.");
    }
}

