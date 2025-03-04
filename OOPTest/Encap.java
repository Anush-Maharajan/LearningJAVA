package OOPTest;

public class Encap {

    public static void main(String[] args) {
        Grandparent Nuche = new Grandparent();
        parent Buddha = new parent();;
        child Biraj = new child();
        Biraj.askChocolate(5);
        System.out.println(Buddha.car);
        System.out.println(Nuche.ring);

    }
}

class Grandparent {
    int ring = 1;
}

class parent extends Grandparent {
    int car = 1;
}

class child extends parent {
    int chocolate = 12;

    void askChocolate(int value) {
        System.out.println("Biraj looking at you while whining, \"Please give me Chocolate please please please\"\nHow many will you give him?");
        if (value > 0) {
            System.out.println("Thank you! Thank you!");
        }
        else {
            System.out.println("\"You are so mean\", Biraj cires as he shouts to you");
        }
        chocolate += value;
    }
}