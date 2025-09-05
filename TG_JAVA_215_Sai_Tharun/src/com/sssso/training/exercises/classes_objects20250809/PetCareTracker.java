package com.sssso.training.exercises.classes_objects20250809;

class Pet {
    String name;
    int age;
    String breed;

    Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void feedingReminder() {
        System.out.println("Time to feed " + name + "!");
    }
}

public class PetCareTracker {
	
    public static void main(String[] args) {
        Pet myPet = new Pet("Buddy", 3, "Golden Retriever");
        myPet.feedingReminder();
    }
}