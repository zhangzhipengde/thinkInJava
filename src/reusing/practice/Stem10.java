package reusing.practice;
// reusing/Stem10.java

// TIJ4 Chapter Reusing, Exercise 10, page 246
/* Modify the previous exercise so that each class only has non-default 
* constructors.
*/

class Component11 {

    Component11(byte b) {
        System.out.println("Component1(byte)");
    }
}

class Component21 {

    Component21(short s) {
        System.out.println("Component2(short)");
    }
}

class Component31 {

    Component31(int i) {
        System.out.println("Component3(int)");
    }
}

class Root1 {

    Component11 c1root;
    Component21 c2root;
    Component31 c3root;

    Root1(float f) {
        c1root = new Component11((byte) 0);
        c2root = new Component21((short) 0);
        c3root = new Component31(0);
        System.out.println("Root(foat)");
    }
}

class Stem10 extends Root1 {

    Component11 c1stem10;
    Component21 c2stem10;
    Component31 c3stem10;

    Stem10(double d) {
        super(2.78f);
        c1stem10 = new Component11((byte) 1);
        c2stem10 = new Component21((short) 1);
        c3stem10 = new Component31(1);
        System.out.println("Stem10(double)");
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Stem10 x = new Stem10(2.78);
    }
}
