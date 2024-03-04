package com.stellaproject;

import java.util.Scanner;

public class Animals {
    String specie;
    int quantity;
    public static String selectCategory(Scanner scanner) {
        boolean validInput = false;
        String category = "";

        while (!validInput) {
            System.out.println("Enter the category # you need information from:");
            System.out.println("1) Mammals, 2) Reptiles or 3) Aquatics: ");
            category = scanner.nextLine().toLowerCase();
            if (category.equals("1") || category.equals("2") || category.equals("3")) {
                validInput = true;
            } else {
                System.out.println("Not a valid selection.");
            }
        }
        return category;
    }

    public Animals(String specie, int quantity) {
        this.specie = specie;
        this.quantity = quantity;
    }
    public String getSpecie() {
        return specie;
    }
    public int getQuantity() {
        return quantity;
    }
}
