import java.util.ArrayList;
import java.util.Scanner;

public class Statics {

    public static void main(String[] args) {

        Human h1 = new Human("obaydul");
        Human h2 = new Human("kuddus");
        Human h3 = new Human("rahul");

        Human target = Human.findByRoll(2);
        target.sayName();
    }
}

class Human {
    String name;
    int roll;
    public static ArrayList<Human> humans = new ArrayList<Human>();
    public static int humanCounter = 0;

    public static Human findByRoll(int _roll) {
        for (Human human : humans) {
            if (human.roll == _roll)
                return human;
        }
        return null;
    }

    public Human(String _name) {
        this.name = _name;
        this.roll = Human.humanCounter;
        Human.humanCounter++;

        Human.humans.add(this);
    }

    public void sayName() {
        System.out.println("entering sayName");
        System.out.println(this);
        System.out.println("leaving sayName");

    }

    public String toString() {
        System.out.println("inside toString");

        return "Hi, my name is " + this.name;
    }
}
