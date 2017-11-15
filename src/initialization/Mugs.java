package initialization;
//: initialization/Mugs.java

// Java "Instance Initialization."

class Mug {

    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs {

    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}

// initialization/InstanceClauseTest.java
// TIJ4 Chapter Initialization, Exercise 15, page 193
// Create a class wih a String that is initialized using instance initialization

class Tester1 {

    String s;
    {
        s = "Initializing string in Tester";
        System.out.println(s);
    }

    Tester1() {
        System.out.println("Tester()");
    }
}

class InstanceClauseTest {

    public static void main(String[] args) {
        new Tester1();
    }
}
