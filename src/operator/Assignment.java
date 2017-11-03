package operator;
//: operators/Assignment.java
class Tank {

    int level;
}

public class Assignment {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
//        t1 = t2;
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
} /*
   * Output: 1: t1.level: 9, t2.level: 47 2: t1.level: 47, t2.level: 47 3: t1.level: 27, t2.level: 27
   */// :~



class Tube {
    float level;
}

class Assign {
    public static void main(String[] args) {
        Tube t1 = new Tube();
        Tube t2 = new Tube();
        t1.level = 0.9f;
        t2.level = 0.47f;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);       
        t1.level = 0.27f; 
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
