package control;
import java.util.Random;

//: control/ListCharacters.java
// Demonstrates "for" loop by listing
// all the lowercase ASCII letters.

public class ListCharacters {

    public static void main(String[] args) {
        for (char c = 0; c < 128; c++)
            if (Character.isLowerCase(c))
                System.out.println("value: " + (int) c + " character: " + c);
    }
}

class Count {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++)
            System.out.println(i);
    }
}

class CompareInts {

    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = rand1.nextInt();
            int y = rand2.nextInt();
            if (x < y)
                System.out.println(x + " < " + y);
            else if (x > y)
                System.out.println(x + " > " + y);
            else
                System.out.println(x + " = " + y);
        }

        Random rand3 = new Random();
        Random rand4 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = rand3.nextInt(10);
            int y = rand4.nextInt(10);
            if (x < y)
                System.out.println(x + " < " + y);
            else if (x > y)
                System.out.println(x + " > " + y);
            else
                System.out.println(x + " = " + y);
        }
    }
}

class CompareIntsForever {

    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = rand1.nextInt();
            int y = rand2.nextInt();
            if (x < y)
                System.out.println(x + " < " + y);
            else if (x > y)
                System.out.println(x + " > " + y);
            else
                System.out.println(x + " = " + y);
        }
        Random rand3 = new Random();
        Random rand4 = new Random();
        while (true) {
            // for(int i = 0; i < 25; i++) {
            int x = rand3.nextInt(10);
            int y = rand4.nextInt(10);
            if (x < y)
                System.out.println(x + " < " + y);
            else if (x > y)
                System.out.println(x + " > " + y);
            else
                System.out.println(x + " = " + y);
        }
    }
}

class Primes {

    // TODO
    public static void main(String[] args) {
        // for (int i = 1; i < 1000; i++) {
        // int factors = 0;
        // for (int j = 1; j < (i + 2) / 2; j++) {
        // if ((i % j) == 0)
        // factors++;
        // }
        // if (factors < 2)
        // System.out.println(i + " is prime");
        // }

        int j;
        boolean flag;
        for (int i = 2; i < 1000; i++) {
            flag = false;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(i + " is prime");
            }
        }
    }
}

// control/BitTest.java
// TIJ4 Chapter Control, Exercise 5, page 140
/*
 * Repeat exercise 10 from the last chapter using the ternary operator and a bitwise test to display the ones and zeros,
 * instead of Integer.toBinaryString()
 */
class BitTest {

    // TODO
    static void binaryPrint(int q) {
        if (q == 0)
            System.out.print(0);
        else {
            int nlz = Integer.numberOfLeadingZeros(q);
            q <<= nlz;
            for (int p = 0; p < 32 - nlz; p++) {
                int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
                System.out.print(n);
                q <<= 1;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        int k = 0x100;
        int m = 0;
        System.out.println("Using Integer.toBinaryString():");
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("k = " + Integer.toBinaryString(k));
        System.out.println("m = " + Integer.toBinaryString(m));
        System.out.println("i & j = " + (i & j) + " = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + (i | j) + " = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + (i ^ j) + " = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i = " + Integer.toBinaryString(~i));
        System.out.println("~j = " + Integer.toBinaryString(~j));
        System.out.println("Using binaryPrint():");
        System.out.print("i = " + i + " = ");
        binaryPrint(i);
        System.out.print("j = " + j + " = ");
        binaryPrint(j);
        System.out.print("k = " + k + " = ");
        binaryPrint(k);
        System.out.print("m = " + m + " = ");
        binaryPrint(m);
        System.out.print("i & j = " + (i & j) + " = ");
        binaryPrint(i & j);
        System.out.print("i | j = " + (i | j) + " = ");
        binaryPrint(i | j);
        System.out.print("i ^ j = " + (i ^ j) + " = ");
        binaryPrint(i ^ j);
        System.out.print("~i = " + ~i + " = ");
        binaryPrint(~i);
        System.out.print("~j = " + ~j + " = ");
        binaryPrint(~j);
    }
}
