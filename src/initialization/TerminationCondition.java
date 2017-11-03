package initialization;
//: initialization/TerminationCondition.java

// Using finalize() to detect an object that
// hasn't been properly cleaned up.

class Book {

    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut)
            System.out.println("Error: checked out");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

public class TerminationCondition {

    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
    }
}

// initialization/TerminationConditionEx.java
// TIJ4 Chapter Initialization, Exercise 10, page 177
/*
 * Create a class with a finalize() method that prints a message. In main(), create an object of your class. Explain the
 * behavior of your program.
 */

class WebBank {

    boolean loggedIn = false;

    WebBank(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logIn() {
        loggedIn = true;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn)
            System.out.println("Error: still logged in");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

@SuppressWarnings("unused")
class TerminationConditionEx {

    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);
        // Proper cleanup: log out of bank1 before going home
        bank1.logOut();
        // Drop the reference, forget to cleanup:
        new WebBank(true);
        // Force garbage collection and finalization:
        System.gc();
    }
}

// initialization/BankTest.java
// TIJ4 Chapter Initialization, Exercise 11, page 177
// Modify the previous exercise so that finalize() will always be called.

class WebBank1 {

    boolean loggedIn = false;

    WebBank1(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn)
            System.out.println("Error: still logged in");
        // Normally, you'll also call the base-class version:
        // super.finalize();
    }
}

class BankTest1 {

    @SuppressWarnings({"unused", "deprecation" })
    public static void main(String[] args) {
        WebBank1 bank1 = new WebBank1(true);
        WebBank1 bank2 = new WebBank1(true);
        new WebBank1(true);
        // Proper cleanup: log out of bank1 before going home:
        bank1.logOut();
        // Forget to logout of bank2 and unnamed new bank
        // Attempts to finalize any missed banks:
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        // using deprecated since 1.1 method:
        System.runFinalizersOnExit(true);
    }
}

// initialization/TankTest.java
// TIJ4 Chapter Initialization, Exercise 12, page 177
/*
 * Create a class called Tank that can be filled and emptied, and has a termination condition that it must be empty when
 * the object is cleaned up. Write a finalize() that verifies this termination condition. In main(), test the possible
 * scenarios that can occur whtn your Tank is used.
 */

class Tank {

    int howFull = 0;

    Tank() {
        this(0);
    }

    Tank(int fullness) {
        howFull = fullness;
    }

    void sayHowFull() {
        if (howFull == 0)
            System.out.println("Tank is empty");
        else
            System.out.println("Tank filling status = " + howFull);
    }

    void empty() {
        howFull = 0;
    }

    protected void finalize() {
        if (howFull != 0)
            System.out.println("Error: Tank not empty");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

class TankTest {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank(3);
        Tank tank3 = new Tank(5);
        // Proper cleanup: empty tank before going home
        tank2.empty();
        // Drop the reference, forget to cleanup:
        new Tank(6);
        System.out.println("Check tanks:");
        System.out.println("tank1: ");
        tank1.sayHowFull();
        System.out.println("tank2: ");
        tank2.sayHowFull();
        System.out.println("tank3: ");
        tank3.sayHowFull();
        System.out.println("first forced gc():");
        System.gc();
        // Force finalization on exit but using method
        // deprecated since JDK 1.1:
        System.out.println("try deprecated runFinalizersOnExit(true):");
        System.runFinalizersOnExit(true);
        System.out.println("last forced gc():");
        System.gc();
    }
}
