import java.util.Scanner;

public class BillingSystem {

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        // Ask the name of the person
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        return name;
    }

    public static String getDOB() {
        Scanner scanner = new Scanner(System.in);
        // Ask the DOB of the person
        System.out.println("What is your DOB?");
        String dob = scanner.nextLine();

        return dob;
    }

    public static int MemberShip() {
        int discount = 0;
        // choices within the membership card
        while (true) {
            Scanner sc = new Scanner(System.in);
            //ask the user if membership is needed
            System.out.println("Would you like to get a membership [Y/N]?\n===>");
            String memChoice = sc.nextLine();
    
            if(memChoice.equalsIgnoreCase("Y")) {
                while (true) {
                    System.out.println("Which membership would you like? [Gold(1)/Silver(2)]");
                    int memType = sc.nextInt();

                    if(memType == 1) {
                        System.out.println("That will be $500, thank you!");
                        discount = 20;
                        break;
                    }

                    else if(memType == 2) {
                        System.out.println("That will be $300, thank you!");
                        discount = 10;
                        break;
                    }

                    else {
                        System.out.println("Please enter the correct option!");
                    }
                }
                break;
            }
            
            else if(memChoice == "N" || memChoice == "n") {
                System.out.println("Ah Okay, Thank you for registering.");
                break;
            }

            else {
                System.out.println("Please enter the correct option!");
            }
        }
        
        return discount;
    }

    public static void Menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("S.No\tItem\t\tPrice");
        System.out.println("1\tApple\t\t$2");
        System.out.println("2\tBanana\t\t$1");
        System.out.println("3\tOrange\t\t$3");
        System.out.println("4\tGrapes\t\t$4");
        System.out.println("5\tMango\t\t$5");

        System.out.println("Enter the item number you would like to purchase: ");
        String item = sc.nextLine();
        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();

        if (quantity < 0) {
            System.out.println("Please enter a valid quantity!");
        }
        else {
            switch (item) {
                case "1":
                    System.out.println("You have selected Apple. The total amount is $" + (2 * quantity));
                    break;
                case "2":
                    System.out.println("You have selected Banana. The total amount is $" + (1 * quantity));
                    break;
                case "3":
                    System.out.println("You have selected Orange. The total amount is $" + (3 * quantity));
                    break;
                case "4":
                    System.out.println("You have selected Grapes. The total amount is $" + (4 * quantity));
                    break;
                case "5":
                    System.out.println("You have selected Mango. The total amount is $" + (5 * quantity));
                    break;
                default:
                    System.out.println("Please enter a valid item number!");
                    break;
            }
            
        }
        sc.close();
    }
    
    
    public static void main(String[] args) {
        System.out.print("Welcomne to the SOKAMONA Market.\nWhat would you like to do?[register(1)/purchase(2)]\n===>  ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int customerchoice = scanner.nextInt();

            if(customerchoice == 1) {
                String name = getName();
                String dob = getDOB();
                System.out.println("\n\n\n");
                int discount = MemberShip();
                System.out.println(name + " " + dob + " " + discount);
                break;
            }

            else if(customerchoice == 2) {
                System.out.println("Sure, What would you like to buy?\n\n\n");
                Menu();
                break;
            }

            else {
                System.out.println("Please enter the correct option!");
                System.out.println("What would you like to do?[register(1)/purchase(2)]\n===>  ");
            }
            scanner.close();
        }
        System.out.println();
    }
     
}