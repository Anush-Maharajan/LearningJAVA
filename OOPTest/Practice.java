package OOPTest;

public class Practice {
    public static void main(String[] args) {
        OOPTest.values one = new OOPTest.values();
        one.setter(4);
        int value = one.getter();
        System.out.println(value);
    }
}