package control;

//: control/VowelsAndConsonants.java
// Demonstrates the switch statement.
import java.util.*;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.println((char) c + ", " + c + ": ");
            switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            case 'y':
            case 'w':
                System.out.println("Sometimes a vowel");
                break;
            default:
                System.out.println("consonant");
            }
        }
    }
}

// control/SwitchTest.java
// TIJ4 Chapter Control, Exercise 8, page 153
/*
 * Create a switch statement that prints a message for each case, and put the switch inside a for loop that tries each
 * case. Put a break after each case and test it, then remove the breaks and see what happens.
 */
class SwitchTest {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            switch (i) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("isa");
                break;
            case 2:
                System.out.println("dalawa");
                break;
            case 3:
                System.out.println("tatlo");
                break;
            case 4:
                System.out.println("apat");
                break;
            case 5:
                System.out.println("lima");
                break;
            case 6:
                System.out.println("anim");
                break;
            case 7:
                System.out.println("pito");
                break;
            case 9:
                System.out.println("siyam");
                break;
            case 8:
                System.out.println("walo");
                break;
            default:
                System.out.println("default");
            }
        }
    }
}

// control/Fibonacci.java
// TIJ4 Chapter Control, Exercise 9, page 153
/*
 * A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each number (from the
 * third on) is the sum of the previous two. Create a method that takes an integer as an argument and displays that many
 * Fibonacci numbers starting from the beginning, e.g.,if you run java Fibonacci 5 (where Fibonacci is the name of the
 * class) the output will be 1,1,2,3,5.
 */

class Fibonacci {

    int fib(int n) {
        if (n < 2)
            return 1;
        return (fib(n - 2) + fib(n - 1));
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int k = Integer.parseInt(args[0]);
        System.out.println("First " + k + " Fibonacci number(s): ");
        for (int i = 0; i < k; i++)
            System.out.println(f.fib(i));
    }
}

// control/VampireNumbers.java
// TIJ4 Chapter Control, Exercise 10, page 154
/*
 * A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing half the
 * number of digits of the result. The digits are taken from the original number in any order. Pairs of trailing zeroes
 * are not allowed. Examples include: 1260 = 21 * 60, 1827 = 21 * 87, (Suggested by Dan Forhan.) 2187 = 27 * 81. Write a
 * program that finds all the 4-digit vampire numbers.
 */

class VampireNumbers {

    static int a(int i) {
        return i / 1000;
    }

    static int b(int i) {
        return (i % 1000) / 100;
    }

    static int c(int i) {
        return ((i % 1000) % 100) / 10;
    }

    static int d(int i) {
        return ((i % 1000) % 100) % 10;
    }

    static int com(int i, int j) {
        return (i * 10) + j;
    }

    static void productTest(int i, int m, int n) {
        if (m * n == i)
            System.out.println(i + " = " + m + " * " + n);
    }

    public static void main(String[] args) {
        for (int i = 1001; i < 9999; i++) {
            productTest(i, com(a(i), b(i)), com(c(i), d(i)));
            productTest(i, com(a(i), b(i)), com(d(i), c(i)));
            productTest(i, com(a(i), c(i)), com(b(i), d(i)));
            productTest(i, com(a(i), c(i)), com(d(i), b(i)));
            productTest(i, com(a(i), d(i)), com(b(i), c(i)));
            productTest(i, com(a(i), d(i)), com(c(i), b(i)));
            productTest(i, com(b(i), a(i)), com(c(i), d(i)));
            productTest(i, com(b(i), a(i)), com(d(i), c(i)));
            productTest(i, com(b(i), c(i)), com(d(i), a(i)));
            productTest(i, com(b(i), d(i)), com(c(i), a(i)));
            productTest(i, com(c(i), a(i)), com(d(i), b(i)));
            productTest(i, com(c(i), b(i)), com(d(i), a(i)));
        }
    }
}
