package operator;
//: operators/Overflow.java
// Surprise! Java lets you overflow.

public class Overflow {

    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}

class StringCompare {

    static void f(boolean b) {
        if (b == true)
            System.out.println(true);
        else
            System.out.println(false);
    }

    static void stringTest(String s, String t) {
        f(s == t);
        f(s.equals(t));
        f(t.equals(s));
        f(s != t);
        // f(!s);
        // f(!t);
        // s = s && t;
        // s = s || t;
        // s = ~t;
        // s = s & t;
        // s = s | t;
        // s = s ^ t;
        // s &= t;
        // s ^= t;
        // s |= t;
    }

    public static void main(String[] args) {
        String s = "one", t = "two";
        StringCompare.stringTest(s, t);
    }
}
