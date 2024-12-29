import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays: ");
        int size = sc.nextInt();
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];

        for(int i = 0; i< size; i++) {
            System.out.print("Enter the " + (i + 1) + "th Number: ");
            arr1[i] = sc.nextInt();
        }
        
        for(int i = 0; i< size; i++) {
            System.out.print("Enter the " + (i + 1) + " Number: ");
            arr2[i] = sc.nextInt();
        }


        System.out.println("Here are the numbers: ");
        System.out.println("First Array:");

        for(int i = 0; i < size; i++) {
            System.out.println(arr2[i]);
        }


        System.out.println("Second Array:");
        for(int i = 0; i < size; i++) {
            System.out.println(arr2[i]);
        }
        sc.close();
    }
}
