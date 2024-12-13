public class Methods {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int ans = sum(a,b);
        System.out.println(ans);
    }

    public static int sum(int fnum, int snum) { //int fnum = a & int snum = b
        int sum = fnum + snum;
        return sum;
    }
}
