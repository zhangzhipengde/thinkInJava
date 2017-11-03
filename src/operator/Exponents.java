package operator;
//: operators/Exponents.java
// "e" means "10 to the power."

public class Exponents {

    public static void main(String[] args) {
        // Uppercase and lowercase 'e' are the same:
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // 'd' is optional
        double expDouble2 = 47e47; // Automatically double
        System.out.println(expDouble);
        System.out.println(expDouble2);
    }
}

class MinMax {
    public static void main(String[] args) {
        double max = java.lang.Double.MAX_VALUE;
        System.out.println("Max double = " + max);
        double min = java.lang.Double.MIN_VALUE; 
        System.out.println("Min double = " + min);
        float maxf = java.lang.Float.MAX_VALUE;
        System.out.println("Max float = " + maxf);
        float minf = java.lang.Float.MIN_VALUE; 
        System.out.println("Min float = " + minf);  
    }
}
