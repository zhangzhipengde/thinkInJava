package initialization;
//: initialization/Flower.java
// Calling constructors with "this"

public class Flower {

    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        // ! this(s); // Can't call two!
        this.s = s; // Another use of "this"
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        // ! this(11); // Not inside non-constructor!
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}

// initialization/OverloadedConstructors.java
// TIJ4 Chapter Initialization, Exercise 9, page 172
// Create a class with two (overloaded) constructors. Using 'this', call
// the second constructor from inside the first one.

@SuppressWarnings("unused")
class Doc1 {

    Doc1(int i) {
        this("MD");
        int yearsTraining = i;
        System.out.println("New doc with " + i + " years of training");
    }

    Doc1(String s) {
        String degree = s;
        System.out.println("New doc with " + s + " degree");
    }

    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
    }

    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}

class OverloadedConstructors {

    public static void main(String[] args) {
        new Doc1(8).intubate();
    }
}
