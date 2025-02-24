package OOPTest;

public class Practice {
    public static void main(String[] args) {
        OOPTest.values one = new OOPTest.values();
        one.setter(4,5);
        int[] value = one.getter();
        System.out.printf("a: %d and b: %d", value[0], value[1]);
    }
}

