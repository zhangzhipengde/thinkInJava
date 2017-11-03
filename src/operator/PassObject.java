package operator;
//: operators/PassObject.java
// Passing objects to methods may not be
// what you're used to.

class Letter {

    char c;
}

public class PassObject {

    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
} 

class Box {
    float a;
}

class PassObject21 {
    static void f(Box y) {
        y.a = 2.71828f;
    }
    public static void main(String[] args) {
        Box x = new Box();
        x.a = 3.1416f;
        System.out.println("1: x.a = " + x.a);
        f(x);   
        System.out.println("2: x.a = " + x.a);
    }
}

