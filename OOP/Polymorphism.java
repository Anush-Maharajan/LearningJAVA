package OOP;

class A{
    public int sum(int a,int b){
        int sum= a+b;
        return sum;
    }
    public int sum(int a,int b,int c){
        int sum= a+b+c;
        return sum;
    }
    public String sum(String a,int b){
        return a+" "+b;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();

        int sum1 = obj.sum(1,2);
        int sum2 = obj.sum(3,4,5);
        String word = obj.sum("one",1);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(word);

    }
}