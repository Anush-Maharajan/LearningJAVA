import java.util.Scanner;

public class BillingSystem {

    public static String[] Register() {
        Scanner scanner = new Scanner((Readable) System.out);
        // Ask the name of the person
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // Ask the D.O.B of the customer
        System.out.println("What is your DOB?");
        String DOB = scanner.nextLine();
        scanner.close();
        String[] userData = {name, DOB};

        return userData;
    }

    public static int MemberShip() {
        Scanner scanner = new Scanner(System.in);
        //ask the user if membership is needed
        System.out.println("Would you like to get a membership [Y/N]?");
        String memChoice = scanner.nextLine();

        int discount = 0;
        // choices within the membership card
        if(memChoice == "Y" || memChoice == "y") {
            System.out.println("Which membership would you like %s ? [Gold(1)/Silver(2)]");
            int memType = scanner.nextInt();
            if(memType == 1) {
                System.out.println("That will be $500, thank you!");
                discount = 20;
                }

            else if(memType == 2) {
                System.out.println("That will be $300, thank you!");
                discount = 10;
                }

            else {
                System.out.println("Please enter the correct option!");
                }
        }
        else if(memChoice == "N" || memChoice == "n") {
            System.out.println("Ah Okay, Thank you for registering.");
        }
        else {
            
        }
        scanner.close();

        return discount;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcomne to the SOKAMONA Market.\nWhat would you like to do?[register(1)/purchase(2)]\n===>  ");
        int customerchoice = scanner.nextInt();

        if(customerchoice == 1) {
            String[] nameAndDOB = Register();
            int discount = MemberShip();
        }
        else if(customerchoice == 2) {
            System.out.println("Sure, What would you like to buy?");


        }
        System.out.println();
        scanner.close();
    }
     
}