package reusing.practice;
// reusing/E.java
//TIJ4 Chapter Reusing, Exercise 4, page 245
// TIJ4 Chapter Reusing, Exercise 4, page 245
/* Prove that base-class constructors are (a) always called and (b) called before
* derived-class constructors.
*/

class A1 {

    A1() {
        System.out.println("A()");
    }
}

class B1 extends A1 {

    B1() {
        System.out.println("B()");
    }
}

class C1 extends B1 {

    C1() {
        System.out.println("C()");
    }
}

class D1 extends C1 {

    D1() {
        System.out.println("D()");
    }

    public static D1 makeD() {
        return new D1();
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        D1 d = new D1();
        D1 d2 = makeD();
    }
}

public class E extends D1 {

    E() {
        System.out.println("E()");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        E e = new E();
        // test D:
        D1.main(args);
    }
}
