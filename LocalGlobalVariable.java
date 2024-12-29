public class LocalGlobalVariable {
    public static void main(String[] args) {
        int disc = 50;
        System.err.println(disc);
        disc = discount();
        System.err.println(disc);
        if(disc == 120) {
            disc = 10;
            System.err.println(disc);
        } 
        System.out.println(disc);
    }

    public static int discount() {
        int discount = 120;
        return discount;
    }
}
