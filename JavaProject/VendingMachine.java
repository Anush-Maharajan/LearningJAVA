package JavaProject;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.menu();
        System.out.println("Give me your money!!");
        int moneyDeposited = machine.takeInput(); //Tells  the money you have to buy the food
        System.out.println("What do you want to eat??\nTell me its Number!!");
        int selectedItem = machine.takeChoice(); // tell which food you want by the number
        int change = 0 ;

        while(true) {
            if(moneyDeposited < 50) { //checks if you have the minimum to buy the food
                System.out.println("Get out of the Store you beggar!!!");
                break;
            }
            else if(selectedItem == 1 && moneyDeposited >= 50) {
                System.out.println("You have chosen PaniPuri!!");
                change = moneyDeposited - 50;
                break;
            }
            else if(selectedItem == 2 && moneyDeposited >=100) {
                System.out.println("You have chosen Chatpate!!");
                change = moneyDeposited - 100;
                break;
            }
            else if(selectedItem == 3 && moneyDeposited >=250) {
                System.out.println("You have chosen Keema Noodles!!");
                change = moneyDeposited - 250;
                break;
            }
            else if(selectedItem > 3 || selectedItem < 1) {
                System.out.println("What kind of option is that??");
            }
            else {
                System.out.println("You don't have enough money to buy that!!");
                System.out.println("Do you want to add money or get out?[Y/N]");
                Scanner scanner = new Scanner(System.in);
                String addingChoice = scanner.nextLine();

                if (addingChoice == "Y" || addingChoice == "y") {
                    int moneyAdded = machine.addMoney();
                    moneyDeposited += moneyAdded;
                }
                else if (addingChoice == "N" || addingChoice == "n") {
                    System.out.println("Then get out of my store!!");
                    break;
                }
                else {
                    System.out.println("What kind of aswer is that??");
                }
                scanner.close();
            }
        }
        System.out.println("You have" + change + "left!!");
    }

    public void menu() {
        System.out.println("\n\n\n\t\t\tWelcome to the Vending Machine\n");
        System.out.println("==============================================================================");
        System.out.println("\t\tS.No.\t\t\tName\t\t\tPrice(Rs.)\n");
        System.out.println("\t\t1.\t\t\tPanipuri\t\t\t50.00");
        System.out.println("\t\t2.\t\t\tChatpate\t\t\t100.00");
        System.out.println("\t\t3.\t\t\tKeema Noodles\t\t\t250.00");
    }

    public int takeInput() {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        sc.close();
        return amount;
    } 

    public int takeChoice() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();
        return choice;
    }

    public int addMoney() {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        scanner.close();
        return money;
    }
}
