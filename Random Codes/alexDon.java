import java.util.Scanner;

public class alexDon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.print("So your name is " + name);
        // System.out.println(name);
        scanner.close();
    }
}
