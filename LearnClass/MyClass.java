package LearnClass;

class Encapsulatuion {
    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }
}
public class MyClass extends oops {
    public static void main(String[] args) {
        Encapsulatuion enc = new Encapsulatuion(); 
        enc.setPassword(1234);
        int value = enc.getPassword();
        System.out.println(value);
    }
}

