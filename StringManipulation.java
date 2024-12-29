import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int len = st.length();
        String upper = st.toUpperCase();
        String lower = st.toLowerCase();
        System.out.println(len);
        System.out.println(upper);
        System.out.println(lower);

        System.out.println("\n\n");

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s1.equals(s3)); //true

        sc.close();
    }
    
}
