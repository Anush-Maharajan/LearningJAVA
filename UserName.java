import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask for the name of the person
        System.err.println("What is your Name?");
        String name = sc.nextLine();
        // get the length of the name
        int len = name.length();
        //Split the name into an array
        String[] divName = name.split(" ") ;
        //change the spaces into dashes
        String noSpaceName = name.replace(" ", "_");
        //get the length of the array
        int arrSize = divName.length;

        System.err.println(len);

        for(int i = 0; i < arrSize; i++) {
            System.out.print(divName[i]);
            System.out.print(" ");
        }
        System.out.println();
        
        System.out.println(noSpaceName);


        sc.close();
    }
    
}
