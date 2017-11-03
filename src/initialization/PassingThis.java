package initialization;
//: initialization/PassingThis.java

class Person {

    @SuppressWarnings("unused")
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {

    static Apple peel(Apple apple) {
        // ... remove peel
        return apple; // Peeled
    }
}

class Apple {

    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

public class PassingThis {

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}

// initialization/PassingThisEx.java
// TIJ4 Chapter Initialization, Exercise 8, page 170
/*
 * Create a class with two methods. Within the first method, call the second method twice: the first time without using
 * this, and the second time using this - just to see it working; you should not use this form in practice.
 */

class Doc {

    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
        this.laryngoscopy();
    }

    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}

class PassingThisEx {

    public static void main(String[] args) {
        new Doc().intubate();
    }
}
