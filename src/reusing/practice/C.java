package reusing.practice;
// reusing/Ex5/C.java

// TIJ4 Chapter Reusing, Exercise 5, page 245
/* Create two classes, A and B, with default constructors (empty argument
* lists) that announce themselves. Inherit a new class called C from A, and
* create a member of class B inside C. Do not create a constructor for C. Create
* an object of class C and observe the resluts. 
*/

class A {

    A() {
        System.out.println("A()");
    }
}

class B extends A {

    B() {
        System.out.println("B()");
    }
}

class C extends A {

    B b = new B(); // will then construct another A and then a B

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        C c = new C(); // will construct an A first
    }
}
