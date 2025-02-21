package OOP;
//private fields
//public get and set methods to access the private fields
class Encapsulation {
    //instance variable
    private int password;
    //constructor
    Encapsulation(){
        System.out.println("hello");
    }
    //setter method
    public void setPassword(int p) {
        this.password=p;
    }
    //getter method
    public int getPassword() {
        return password;
    }
}
public class MyClass{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setPassword(12);
        int value = obj.getPassword();
        System.out.println(value);
    }
}
