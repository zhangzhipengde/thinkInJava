package control;

//: control/ForEachInt.java

import static net.mindview.util.Range.*;

public class ForEachInt {

    public static void main(String[] args) {
        for (int i : range(10)) // 0..9
            System.out.print(i + " ");
        System.out.println();
        for (int i : range(5, 10)) // 5..9
            System.out.print(i + " ");
        System.out.println();
        for (int i : range(5, 20, 3)) // 5..20 step 3
            System.out.print(i + " ");
        System.out.println();
    }
}
