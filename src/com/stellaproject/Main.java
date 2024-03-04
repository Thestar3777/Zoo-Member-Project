package com.stellaproject;

import java.util.Scanner;

import static com.stellaproject.Aquatics.printAquatics;
import static com.stellaproject.Animals.selectCategory;
import static com.stellaproject.Mammals.printMammals;
import static com.stellaproject.Reptiles.printReptiles;
import static com.stellaproject.ZooMemberLogin.checkMember;
import static com.stellaproject.ZooMemberLogin.getZooMemberLogin;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "zooMember123";

        // Create an instance of ZooMemberLogin & check if the user is a member
        ZooMemberLogin zooMemberLogin = getZooMemberLogin(password);
        checkMember(scanner, zooMemberLogin);
        char response;
        String category;

        do {
            category = selectCategory(scanner);
            switch (category) {
                case "1":
                    printMammals();
                    break;

                case "2":
                    printReptiles();
                    break;

                case "3":
                    printAquatics();
            }
            System.out.println("Do you need more information? Y/N");

            response = scanner.nextLine().charAt(0);
        }
        while (response == 'Y' || response == 'y');
        System.out.println("Thank you Member. Goodbye!");
    }
}
