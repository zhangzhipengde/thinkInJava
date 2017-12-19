package access;
//: access/Dinner.java
// Uses the library.
import access.dessert.*;

public class Dinner {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Cookie x = new Cookie();
        // ! x.bite(); // Can't access
    }
} 