import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 to 10");
        int UserGuess = sc.nextInt();
        int randomNumber = (int) (Math.random() * 100);

        while (true) {
                
            if(UserGuess > randomNumber) {
                System.out.println("The given number is too big!!");
            }
            else if( UserGuess < randomNumber) {
                System.out.println("The given number is too small!!");
            }
            else if (UserGuess == randomNumber) {
                break;
            }
            else {
                System.out.println("Invalid number!!");
            }
            System.out.println("Guess the number: ");
            UserGuess = sc.nextInt();
        }

        System.out.println("Congratulations!!");
        System.out.println("You entered the correct number!!");
        sc.close();
    }    
}
