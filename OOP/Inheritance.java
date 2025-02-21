package OOP;
//1.single Level
//    A
//    |
//    B

//2.multi Level
//    A
//    |
//    B
//    |
//    C

//3.Hierarchial
//        A
//       /  \
//      B    C

//4.Multiple inheritance (not allowed in java)
//    A    B
//     \ /
//      C


class Parent{
    public void eat(){
        System.out.println("eat Rice");
    }
}
class Child extends Parent {

}
public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.eat();
    }
}