package control;

//: control/BreakAndContinue.java
// Demonstrates break and continue keywords.

import static net.mindview.util.Range.*;

public class BreakAndContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74)
                break; // Out of for loop
            if (i % 9 != 0)
                continue; // Next iteration
            System.out.print(i + " ");
        }
        System.out.println();
        // Using foreach:
        for (int i : range(100)) {
            if (i == 74)
                break; // Out of for loop
            if (i % 9 != 0)
                continue; // Next iteration
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        // An "infinite loop":
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269)
                break; // Out of loop
            if (i % 10 != 0)
                continue; // Top of loop
            System.out.print(i + " ");
        }
    }
}

class IntCount {

    static void Count1(int n) {
        for (int i = 0; i < n; i++)
            System.out.println(i + 1);

    }

    static void Count2(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
            if (i == 99)
                break;
        }
    }

    static void Count3(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
            if (i == 99)
                return;
        }
    }

    public static void main(String[] args) {
        Count1(100);
        Count2(100);
        Count3(100);
    }
}
