package operator;

//: operators/Bool.java
// Relational and logical operators.
import java.util.*;

public class Bool {

    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(10);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        // Treating an int as a boolean is not legal Java:
        // ! System.out.println("i && j is " + (i && j));
        // ! System.out.println("i || j is " + (i || j));
        // ! System.out.println("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }
}

class CoinToss {

    public static void main(String[] args) {
        Random rand = new Random();
        int coin = rand.nextInt();
        System.out.println(coin);
        System.out.println(2%2);
        System.out.println(2%1);
        System.out.println(0%2);
        System.out.println(3%2);
        if (coin % 2 == 0)
            System.out.println("heads");
        else
            System.out.println("tails");
    }
}
