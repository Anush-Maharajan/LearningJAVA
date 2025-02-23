import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int start = 0;
        int end = input.length() - 1;

        while(start<end) {
            if(input.charAt(start) == input.charAt(end)) {
                start++;
                end--;
            }
            else {
                System.out.println("Not Palindorme!!!");
                break;
            }
        }

        System.out.println(input + " is palindromne!!!");

        sc.close();
    }
}
