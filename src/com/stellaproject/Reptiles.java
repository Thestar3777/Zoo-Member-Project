package com.stellaproject;

public class Reptiles {

    // It generates inner class instances: Pythons, Chameleons and Turtles

    static Reptiles.Pythons pythons = new Reptiles.Pythons("Ball Python", 2);
    static Reptiles.Chameleons chameleons = new Reptiles.Chameleons("Veiled Chameleon", 5);
    static Reptiles.Turtles turtles = new Reptiles.Turtles("Red-eared Slider", 4);

    // Method to print information about reptiles:

    public static void printReptiles() {
        System.out.println("You chose Reptiles: ");
        System.out.println("Presenting data...");
        System.out.println("-------------------------------------------------");
        System.out.println("Here is the data about the Reptiles in the zoo:");
        System.out.println();
        System.out.println("Specie:           Quantity:");
        System.out.println();
        System.out.println(pythons.getSpecie() + "       count: " + pythons.getQuantity());
        System.out.println(chameleons.getSpecie() + "  count: " + chameleons.getQuantity());
        System.out.println(turtles.getSpecie() + "  count: " + turtles.getQuantity());
        System.out.println("-------------------------------------------------");
    }

    // Inner class Pythons, Chameleons, and Turtles with subclass Animals

    public static class Pythons extends Animals {
        public Pythons(String specie, int quantity) {
            super(specie, quantity);
        }
    }
    public static class Chameleons extends Animals {
        public Chameleons(String specie, int quantity) {
            super(specie, quantity);
        }
    }
    public static class Turtles extends Animals {
        public Turtles(String specie, int quantity) {
            super(specie, quantity);
        }
    }
}
