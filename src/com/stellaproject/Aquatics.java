package com.stellaproject;

public class Aquatics {
    static Aquatics.TropicalFish tropicalFish = new Aquatics.TropicalFish("Angelfish", 20);
    static Aquatics.Jellyfish jellyfish = new Aquatics.Jellyfish("Moon Jellyfish", 5);
    static Aquatics.Penguins penguins = new Aquatics.Penguins("Macaroni penguin", 15);

    static void printAquatics() {
        System.out.println("You chose Aquatics: ");
        System.out.println("Presenting data...");
        System.out.println("-------------------------------------------------");
        System.out.println("Here is the data about the Aquatics in the zoo:");
        System.out.println();
        System.out.println("Specie:           Quantity:");
        System.out.println();
        System.out.println(tropicalFish.getSpecie() + "         count: " + tropicalFish.getQuantity());
        System.out.println(jellyfish.getSpecie() + "    count: " + jellyfish.getQuantity());
        System.out.println(penguins.getSpecie() + "  count: " + penguins.getQuantity());
        System.out.println("-------------------------------------------------");
    }
    public static class TropicalFish extends Animals {
        public TropicalFish(String specie, int quantity) {
            super(specie, quantity);
        }
    }
    public static class Jellyfish extends Animals {
        public Jellyfish(String specie, int quantity) {
            super(specie, quantity);
        }
    }
    public static class Penguins extends Animals {
        public Penguins(String specie, int quantity) {
            super(specie, quantity);
        }
    }
}
