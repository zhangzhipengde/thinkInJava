package access;
//: access/LibTest.java

// Uses the library.
import access.net.mindview.simple.List;
import access.net.mindview.simple.Vector;

public class LibTest {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Vector v = new Vector();
        List l = new List();
    }
}

//access/UnpackagedMyClass.java
//TIJ4 Chapter Access, Exercise 1, page 217
//Create a class in a package. Create an instance of your class outside of that package.

/* In another directory:
* // access/mypackage/MyPackagedClass.java
*
* package access.mypackage;
*
* public class MyPackagedClass {
*   public MyPackagedClass() {System.out.println("MyPackagedClass()");}
* } 
*/

class UnpackagedMyClass {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        access.mypackage.MyPackagedClass m = new access.mypackage.MyPackagedClass();
    }

}

// access/Collision.java
// TIJ4 Chapter Access, Exercise 2, page 217
/*
 * Take the code fragments in this section and turn them into a program and verify that collisions do occur.
 */

class Collision {

    @SuppressWarnings({"rawtypes", "unused" })
    public static void main(String[] args) {
        // Vector v = new Vector(); // ambiquous collision
        access.net.mindview.simple.Vector v1 = new access.net.mindview.simple.Vector();
        java.util.Vector v2 = new java.util.Vector();
    }
}
