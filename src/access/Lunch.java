package access;
//: access/Lunch.java

// Demonstrates class access specifiers. Make a class
// effectively private with private constructors:

class Soup1 {

    private Soup1() {
    }

    // (1) Allow creation via static method:
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {

    private Soup2() {
    }

    // (2) Create a static object and return a reference
    // upon request.(The "Singleton" pattern):
    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
        return ps1;
    }

    public void f() {
    }
}

// Only one public class allowed per file:

@SuppressWarnings("unused")
public class Lunch {

    void testPrivate() {
        // Can't do this! Private constructor:
        // ! Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}

// MakeWidget.java
// TIJ4 Chapter Access, Exercise 7, page 230
/*
 * Create the library according to the code fragments describing access and Widget. Create a Widget in a class that is
 * not part of the access package.
 */

/*
 * in access package: // access/Widget.java package access;
 */
class Widget {

    public Widget() {
        System.out.println("Widget()");
    }
}

class MakeWidget {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Widget w = new Widget();
    }
}

// access/ConnectionManager.java
// TIJ4 Chapter Access, Exercise 8, page 233
/*
 * Following the form of the example Lunch.java, create a class called ConnectionManager that manages a fixed array of
 * Connection objects. The client programmer must not be able to explicitly create Connection objects, but can only get
 * them via a static method in ConnectionManager. When ConnectionManager runs out of objects, it returns a null
 * reference. Test the classes in main().
 */

class Connection {

    private static int count = 0;
    @SuppressWarnings("unused")
    private int i = 0;

    private Connection() {
        System.out.println("Connection()");
    }

    // Allow creation via static method:
    static Connection makeConnection() {
        count++;
        return new Connection();
    }

    public static int howMany() {
        return count;
    }

    public String toString() {
        return ("Connection " + count);
    }
}

@SuppressWarnings("unused")
class ConnectionManager {

    static int howManyLeft = 3;
    static Connection[] ca = new Connection[3];
    {
        for (Connection x : ca)
            x = Connection.makeConnection();
    }

    public static Connection getConnection() {
        if (howManyLeft > 0)
            return ca[--howManyLeft];
        else {
            System.out.println("No more connections");
            return null;
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        System.out.println(cm.howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(cm.getConnection());
        System.out.println(howManyLeft);
    }
}
