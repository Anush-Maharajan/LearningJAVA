package JavaProject;

import java.util.Scanner;
class Encapsulation { 
    private String password ="2580";
    Encapsulation(){
        System.out.println("Welcome");
    }
    public void setpassword(String newpassword){
        this.password = newpassword;
    }
    public String getpassword(){
        return password;
    }
    public boolean checkpassword(String checkingPassword){
        if (checkingPassword == password){
            return true;
        }
        else{
            return false;
        }

    }
}

public class Login {
    public static void main(String[] args) {
        Encapsulation cal = new Encapsulation();
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your password");
        String password = scanner.nextLine();
        boolean isCorrect = cal.checkpassword(password);
        System.out.println(isCorrect);
        cal.setpassword(password);
        
        scanner.close();

     
    
}
    
}