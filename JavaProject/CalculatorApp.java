package JavaProject;

import java.util.Scanner;

// Abstract class for abstraction
abstract class Calculator {
    abstract double add(double a, double b);
    abstract double subtract(double a, double b);
    abstract double multiply(double a, double b);
    abstract double divide(double a, double b);
}

// Concrete class implementing the Calculator
class SimpleCalculator extends Calculator {
    // Login: Methods handle operations internally
    double add(double a, double b) {
        return a + b;
    }
    
    double subtract(double a, double b) {
        return a - b;
    }
    
    double multiply(double a, double b) {
        return a * b;
    }
    
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN;
        }
        return a / b;
    }
}

class Login { 
    private String password ="2580";
    Login(){
        System.out.println("Welcome");
    }

    public void setpassword(String newpassword){
        this.password=newpassword;
    }

    public String getpassword(){
        return password;
    }

    public boolean checkpassword(String checkingPassword){
        if (checkingPassword.equals(password)){
            return true;
        }
        return false;
    }
}

public class CalculatorApp {

    public static void Calculator_System() {

        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calc = new SimpleCalculator();
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        switch (operator) {
            case '+':
            result = calc.add(num1, num2);
            break;
            case '-':
            result = calc.subtract(num1, num2);
            break;
            case '*':
            result = calc.multiply(num1, num2);
            break;
            case '/':
            result = calc.divide(num1, num2);
            break;
            default:
            System.out.println("Invalid operator!");
            scanner.close();
            return;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static void main(String[] args) {

        Login cal = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = scanner.nextLine();
        boolean isCorrect = cal.checkpassword(password);
        if (isCorrect) {
            System.out.println("Welcome! What do you want to do?");
            System.out.println("1. Open Calculator.");
            System.out.println("2. Change Password.");
            System.out.print("/nEnter the number of the option\n--> ");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case '1':
                    Calculator_System();
                    break;
                case '2':
                    System.out.println("Enter new Password: ");
                    scanner.nextLine(); //Consume the newline left-over
                    String new_password = scanner.nextLine(); 
                    cal.setpassword(new_password);
                    break;
                default:
                    System.out.println("Error Occured: invalid option");
                    break;
            }
        }
        
        else {
            System.out.println("Invalid Password!!");
        }
        scanner.close();
    }
}