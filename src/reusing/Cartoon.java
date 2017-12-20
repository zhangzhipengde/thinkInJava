package reusing;

//: reusing/Cartoon.java
// Constructor calls during inheritance.

class Art {

    Art() {
        System.out.println("Art constructor");
    }
    
//    static void test(){
//        System.out.println("Art test");
//    }
}

class Drawing extends Art {

    Drawing() {
        System.out.println("Drawing constructor");
    }
    
//    static void test(){
//        System.out.println("Drawing test");
//    }
}

public class Cartoon extends Drawing {

    public Cartoon() {
        System.out.println("Cartoon constructor");
    }
    
//    static void test(){
//        System.out.println("Cartoon test");
//    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
//        x.test();
    }
}
