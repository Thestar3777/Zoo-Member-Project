package com.stellaproject;
public class Mammals {

    static Mammals.Lions lions = new Mammals.Lions("African Lion", 4);
    static Mammals.Monkeys monkeys = new Mammals.Monkeys("Chimpanzee", 25);
    static Mammals.Horses horses = new Mammals.Horses("African horse", 3);

    public static void printMammals() {
        System.out.println("You chose Mammals: ");
        System.out.println("Presenting data...");
        System.out.println("-------------------------------------------------");
        System.out.println("Here is the data about the Mammals in the zoo:");
        System.out.println();
        System.out.println("Specie:         Quantity:");
        System.out.println();
        System.out.println(lions.getSpecie() + "    count: " + lions.getQuantity());
        System.out.println(monkeys.getSpecie() + "      count: " + monkeys.getQuantity());
        System.out.println(horses.getSpecie() + "   count: " + horses.getQuantity());
        System.out.println("-------------------------------------------------");
    }
    public static class Lions extends Animals {
        public Lions(String specie, int quantity) {
            super(specie, quantity);
        }
    }
    public static class Monkeys extends Animals {
        public Monkeys(String specie, int quantity) {
            super(specie, quantity);
        }
    }
    public static class Horses extends Animals {
        public Horses(String specie, int quantity) {
            super(specie, quantity);
        }
    }
}
