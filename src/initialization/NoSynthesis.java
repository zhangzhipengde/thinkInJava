package initialization;
//: initialization/NoSynthesis.java

class Bird2 {

    Bird2(int i) {
    }

    Bird2(double d) {
    }
}

public class NoSynthesis {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // ! Bird2 b = new Bird2(); // No default
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
    }
}

// initialization/DefaultConstructorTest.java
// TIJ4 Chapter Initialization, Exercise 2, page 167
/*
 * Create a class with a default constructor (one that takes no arguments) that prints a message. Create an object of
 * this class.
 */

class Kabayo {

    Kabayo() {
        System.out.println("isa lang kabayo");
    }
}

class DefaultConstructorTest {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Kabayo k = new Kabayo();
    }
}

// initialization/DefaultConstructorTest2.java
// TIJ4 Chapter Initialization, Exercise 4, page 167
/*
 * Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your
 * message.
 */

class Kabayo2 {

    Kabayo2() {
        System.out.println("isa lang kabayo");
    }

    Kabayo2(String s) {
        System.out.println(s);
    }
}

class DefaultConstructorTest2 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Kabayo2 k = new Kabayo2();
        Kabayo2 k2 = new Kabayo2("tumutugtog ng gitara");
    }
}

// initialization/DogTalk.java
// TIJ4 Chapter Initialization, Exercise 5, page 167
/*
 * Create a class with a default constructor (one that takes no arguments) that prints a message. Create an object of
 * this class.
 */

class Dog {

    void bark() {
        System.out.println("quiet");
    }

    void bark(char c) {
        System.out.println("cawcaw");
    }

    void bark(byte b) {
        System.out.println("barkbark");
    }

    void bark(short s) {
        System.out.println("slurpslurp");
    }

    void bark(int i) {
        System.out.println("iyow");
    }

    void bark(long L) {
        System.out.println("lalala");
    }

    void bark(float f) {
        System.out.println("fififoofum");
    }

    void bark(double d) {
        System.out.println("dodo");
    }
}

class DogTalk {

    public static void main(String[] args) {
        Dog d = new Dog();
        char c = 'c';
        byte b = 0;
        short s = 0;
        d.bark();
        d.bark((char) c);
        d.bark((byte) b);
        d.bark((short) s);
        d.bark(1);
        d.bark(1L);
        d.bark(1.0f);
        d.bark(1.0);
    }
}

// initialization/DogTalk2.java
// TIJ4 Chapter Initialization, Exercise 6, page 167
/*
 * Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types), but
 * in reverse order to each other. Verify that this works.
 */

class Dog1 {

    void bark() {
        System.out.println("quiet");
    }

    void bark(char c) {
        System.out.println("cawcaw");
    }

    void bark(byte b) {
        System.out.println("barkbark");
    }

    void bark(short s) {
        System.out.println("slurpslurp");
    }

    void bark(int i) {
        System.out.println("iyow");
    }

    void bark(long L) {
        System.out.println("lalala");
    }

    void bark(float f) {
        System.out.println("fififoofum");
    }

    void bark(double d) {
        System.out.println("dodo");
    }

    void bark(char c, int i) {
        System.out.println("caw-iyow");
    }

    void bark(int i, char c) {
        System.out.println("iyow-caw");
    }
}

class DogTalk2 {

    public static void main(String[] args) {
        Dog1 d = new Dog1();
        char c = 'c';
        byte b = 0;
        short s = 0;
        d.bark();
        d.bark((char) c);
        d.bark((byte) b);
        d.bark((short) s);
        d.bark(1);
        d.bark(1L);
        d.bark(1.0f);
        d.bark(1.0);
        d.bark(c, 1);
        d.bark(1, c);
    }
}

// initialization/AutomaticConstructor.java
// TIJ4 Chapter Initialization, Exercise 7, page 167
/*
 * Create a class without a constructor, and then create an object of that class in main() to verify that the default
 * constructor is automatically synthesized.
 */

class Aso {

    void bark() {
        System.out.println("woof");
    }
}

class AutomaticConstructor {

    public static void main(String[] args) {
        Aso a = new Aso();
        a.bark();
    }
}
