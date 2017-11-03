package operator;
//: operators/EqualsMethod2.java
// Default equals() does not compare contents.

class Value {

    int i;
}

public class EqualsMethod2 {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        System.out.println(v1.i == v2.i);
    }

}

class Dog {

    String name;
    String says;

    void setName(String n) {
        name = n;
    }

    void setSays(String s) {
        says = s;
    }

    void showName() {
        System.out.println(name);
    }

    void speak() {
        System.out.println(says);
    }
}

class DogTest {

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("Spot");
        spot.setSays("Ruff!");
        Dog scruffy = new Dog();
        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        spot.showName();
        spot.speak();
        scruffy.showName();
        scruffy.speak();
    }
}

class DogCompare {

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("Spot");
        spot.setSays("Ruff!");
        Dog scruffy = new Dog();
        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        spot.showName();
        spot.speak();
        scruffy.showName();
        scruffy.speak();

        Dog butch = new Dog();
        butch.setName("Butch");
        butch.setSays("Hello!");
        butch.showName();
        butch.speak();
        System.out.println("Comparison: ");
        System.out.println("spot == butch: " + (spot == butch));
        System.out.println("spot.equals(butch): " + spot.equals(butch));
        System.out.println("butch.equals(spot): " + butch.equals(spot));
        System.out.println("Now assign: spot = butch");
        spot = butch;
        System.out.println("Compare again: ");
        System.out.println("spot == butch: " + (spot == butch));
        System.out.println("spot.equals(butch): " + spot.equals(butch));
        System.out.println("butch.equals(spot): " + butch.equals(spot));
        System.out.print("Spot: ");
        spot.showName();
        spot.speak();
        System.out.print("Butch: ");
        butch.showName();
        butch.speak();

    }
}

class Pig{
    
}

class PigTest{
    public static void main(String[] args) {
        Pig p = new Pig();
        Pig p1 = new Pig();
        System.out.println(p == p1);
        
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p.equals(p1));
        
        p = p1;
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p == p1);
        System.out.println(p.equals(p1));
        
        System.out.println(null == null);
    }
}
