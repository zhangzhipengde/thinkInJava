package access;

//: access/ChocolateChip2.java
import access.cookie2.*;

public class ChocolateChip2 extends Cookie {

    public ChocolateChip2() {
        System.out.println("ChocolateChip2 constructor");
    }

    public void chomp() {
        bite();
    } // Protected method

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}

// access/CookieThief.java
// TIJ4 Chapter Access, Exercise 4, page 227
// Show that protected methods have package access but are not public.
/*
 * In directory Cookie2: //access/cookie2/Cookie.java //Creates a library package access.cookie2; public class Cookie {
 * public Cookie() { System.out.println("Cookie contstructor"); } protected void bite() { System.out.println("bite"); }
 * }
 */

class CookieThief {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Cookie x = new Cookie();
        // ! x.bite(); // access protected
    }
}

// access/AccessTest.java
// TIJ4 Chapter Access, Exercise 5, page 227
/*
 * Create a class with public, private, protected and package-access fields and method members. Create an object of this
 * class and see what kind of compiler messages you get when you try to access all the class members. Be aware that
 * classes in the same directory are part of the "default" package.
 */

// in same directory:
// package access;

class FourWays {

    int a = 0;
    public int b = 1;
    protected int c = 2;
    private int d = 3;

    FourWays() {
        System.out.println("FourWays() constructor");
    }

    void showa() {
        System.out.println(a);
    }

    public void showb() {
        System.out.println(b);
    }

    protected void showc() {
        System.out.println(c);
    }

    @SuppressWarnings("unused")
    private void showd() {
        System.out.println(d);
    }
}

// run command java access.AccessTest

class AccessTest {

    public static void main(String[] args) {
        FourWays fw = new FourWays();
        fw.showa();
        fw.showb();
        fw.showc();
        fw.a = 10;
        fw.b = 20;
        fw.c = 30;
        fw.showa();
        fw.showb();
        fw.showc();
        // ! fw.showd(); // private access, compiler can't touch
    }
}

// access/ProtectedData.java
// TIJ4 Chapter Access, Exercise 6, page 228
/*
 * Create a class with protected data. Create a second class in the same file with a method that manipulates the
 * protected data in the first class.
 */

class SomeData {

    protected int a = 13;
}

class DataChanger {

    static void change(SomeData sd, int i) {
        sd.a = i;
    }
}

class ProtectedData {

    public static void main(String[] args) {
        SomeData x = new SomeData();
        System.out.println(x.a);
        DataChanger.change(x, 99);
        System.out.println(x.a);
    }
}
