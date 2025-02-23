import java.util.Scanner;

public class multiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no. of Columns: ");
        int column = sc.nextInt();
        int [][] multiArray = new int[row][column];
        System.out.println("Enter the values for the Multi Array: ");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.printf("Enter the [%d][%d] Number: ", i, j);
                multiArray[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}
