package com.example.javaclass;

import java.util.Scanner;

public class BillingSystem {
    public static void print(String args) {
        System.out.println(args);
    }

    public static void Register() {
        Scanner scanner = new Scanner(System.out);
        // Ask the name of the person
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // Ask the D.O.B of the customer
        System.out.println("What is your DOB?");
        String DOB = scanner.nextLine();
        //ask the user if membership is needed
        System.out.println("Would you like to get a membership [Y/N]?");
        String memChoice = scanner.nextLine();

        // choices within the membership card
        if(memChoice == "Y" || memChoice == "y") {
            System.out.println("Which membership would you like? [Gold(1)/Silver(2)]");
            int memType = scanner.nextInt();
            if(memType == 1) {
                System.out.println("That will be $500, thank you!");
                float discount = 0.2;
            else if(memType == 2) {
                System.out.println("That will be $300, thank you!");
            else{
                System.out.println();
            }
            }
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcomne to the SOKAMONA Market.\nWhat would you like to do?[register(1)/purchase(2)]\n===>  ");
        int customerchoice = scanner.nextInt();
        print("I am awesome");
        if(customerchoice == 1) {

        }
    }
     
}