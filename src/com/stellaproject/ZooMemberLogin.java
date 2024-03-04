package com.stellaproject;

import java.util.Scanner;

public class ZooMemberLogin {
    private final String password;
    public ZooMemberLogin(String password) {

        this.password = password;
    }

    // It creates an instance of ZooMemberLogin
    public static ZooMemberLogin getZooMemberLogin(String password) {
        ZooMemberLogin zooMemberLogin = new ZooMemberLogin(password);

        System.out.println("\nWelcome to the Zoo Management System!\n");
        return zooMemberLogin;
    }
    // Method to check if the user is a member and authenticate them
    public static void checkMember(Scanner scanner, ZooMemberLogin zooMemberLogin) {
        boolean isAuthenticated = false;
        while (!isAuthenticated) {
            System.out.println("Enter the password to begin: ");
            String userInput = scanner.nextLine();

            isAuthenticated = zooMemberLogin.authenticate(userInput);
        }
        System.out.println(" You are a Member.\n");
    }

    // Method to check if the entered password is correct
    public boolean authenticate(String inputPassword) {
        if(inputPassword.equals(password)) {
            System.out.print("\nCorrect Password.");
            return true;
        }
        else {
            System.out.println("\nWrong password. Try Again");
            return false;
        }
    }
}
