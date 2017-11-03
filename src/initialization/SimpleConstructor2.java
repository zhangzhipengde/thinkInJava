package initialization;
//: initialization/SimpleConstructor2.java
// Constructors can have arguments.

class Rock2 {

    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}

public class SimpleConstructor2 {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
            new Rock2(i);
    }
}

// initialization/ConstructorTest.java
// ITJ4 Chapter Initialization, Exercise 1, p158
// Create a class containing an unitialized String reference. Demonstrate that // this reference is initialized by Java
// to null.

class Tester {

    String s;
}

class ConstructorTest {

    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.s);
    }
}

// initialization/ConstructorTest2.java
// TIJ4 Chapter Initialization, Exercise 2, p158
/*
 * Create a class with a String field that is initialized at the point of definition, and another one that is
 * initialized by the constructor. What is the difference between the two approaches.
 */

class Tester2 {

    String s1;
    String s2 = "hello";
    String s3;

    Tester2() {
        s3 = "good-bye";
    }
}

class ConstructorTest2 {

    public static void main(String[] args) {
        Tester2 t = new Tester2();
        System.out.println("t.s1: " + t.s1);
        System.out.println("t.s2: " + t.s2);
        System.out.println("t.s3: " + t.s3);
    }
}
