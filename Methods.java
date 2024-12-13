import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int value = takeInput();
        printValue(value);
    }

    public static int sum(int fnum, int snum) { //int fnum = a & int snum = b
        int sum = fnum + snum;
        return sum;
    }
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        return a;
    }
    public static void printValue(int value) {
        System.out.println("The number is " + value);
    }
}
