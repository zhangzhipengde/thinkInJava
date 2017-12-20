package reusing.practice;
// reusing/Ex8.java

// TIJ4 Chapter Reusing, Exercise 8, page 246
/* Create a base class with only a non-default constructor, and a derived class
* with both a default (no-arg) and non-default constructor. In the derived-class
* constructors, call the base-class constructor.  
*/

class A3 {

    A3(char c, int i) {
        System.out.println("A(char, int)");
    }
}

@SuppressWarnings("unused")
class Ex8 extends A3 {

    private char c;
    private int i;

    Ex8() {
        super('z', 3);
        System.out.println("Ex8()");
    }

    Ex8(char a, int j) {
        super(a, j);
        c = a;
        i = j;
        System.out.println("Ex8(char,int)");
    }

    public static void main(String[] args) {
        Ex8 ex1 = new Ex8();
        Ex8 ex2 = new Ex8('b', 2);
    }
}
