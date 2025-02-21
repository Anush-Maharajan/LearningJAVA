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
    // Encapsulation: Methods handle operations internally
    @Override
    double add(double a, double b) {
        return a + b;
    }
    
    @Override
    double subtract(double a, double b) {
        return a - b;
    }
    
    @Override
    double multiply(double a, double b) {
        return a * b;
    }
    
    @Override
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN;
        }
        return a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
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
}
