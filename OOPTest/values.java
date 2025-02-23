package OOPTest;

public class values {
    private int a;
    private int b;
    public int c;

    public void setter(int value1, int value2) {
        this.a = value1;
        this.b = value2;
    }

    public int[] getter() {
        return new int[]{a, b};
    }
}
