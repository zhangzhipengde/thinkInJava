package initialization;
//: initialization/OverloadingVarargs3.java

public class OverloadingVarargs3 {

    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
}

// initialization/VarargEx19.java
// TIJ4 Chapter Initialization, Exercise 19, page 204
/*
 * Write a method that takes a vararg String array. Verify that you can pass either a comma-separated list of Strings or
 * a String[] into this method.
 */

class VarargEx19 {

    static void showStrings(String... args) {
        for (String s : args)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        showStrings("one", "TWO", "three", "four");
        showStrings(new String[] {"1", "2", "3", "4" });
    }
}

// initialization/VarargEx20.java
// TIJ4 Chapter Initialization, Exercise 20, page 204
/*
 * Create a main() that uses varargs instead of the ordinary main() syntax. Print all the elements in the resulting args
 * array. Test it with various numbers of command-line arguments.
 */

class VarargEx20 {

    public static void main(String... args) {
        for (String s : args)
            System.out.print(s + " ");
        System.out.println();
    }
}
