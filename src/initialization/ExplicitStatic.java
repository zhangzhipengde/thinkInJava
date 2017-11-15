package initialization;
//: initialization/ExplicitStatic.java

// Explicit static initialization with the "static" clause.

class Cup {

    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {

    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99); // (1)
    }
    // static Cups cups1 = new Cups(); // (2)
    // static Cups cups2 = new Cups(); // (2)
}

// initialization/ExplicitStatic.java
// TIJ4 Chapter Initialization, Exercise 13, page 191
// Verify the statements in the previous paragraph.
// 答案就是上面的代码...

// initialization/ExplicitStaticEx.java
// TIJ4 Chapter Initialization, Exercise 14, page 191
/*
 * Create class with static String field initialized at point of definition and another one initialized by the static
 * block. Add static method that prints both fields and demonstrates that they are both initialized before thay are
 * used.
 */

class Go {

    static String s1 = "run";
    static String s2, s3;
    static {
        s2 = "drive car";
        s3 = "fly plane";
        System.out.println("s2 & s3 initialized");
    }

    static void how() {
        System.out.println(s1 + " or " + s2 + " or " + s3);
    }

    Go() {
        System.out.println("Go()");
    }
}

class ExplicitStaticEx {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Go.how();
        System.out.println("Go.s1: " + Go.s1);
    }

    static Go g1 = new Go();
    static Go g2 = new Go();
}
