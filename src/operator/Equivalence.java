package operator;
//: operators/Equivalence.java

public class Equivalence {

    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println("n1= " + n1);
        System.out.println("n2= " + n2);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);

        int n3 = 47;
        int n4 = 47;
        System.out.println(n3 == n4);
        System.out.println(n3 != n4);
        
        int n5 = 129;
        int n6 = 129;
        System.out.println(n5 == n6);
        System.out.println(n5 != n6);
    }
} /*
   * Output: false true
   */// :~
