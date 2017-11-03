package operator;

//: operators/BitManipulation.java
// Using the bitwise operators.
import java.util.*;

public class BitManipulation {

    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("maxneg", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("i >>> 5", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);
        long ll = 9223372036854775807L;
        printBinaryLong("maxpos", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("maxneg", lln);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);
    }

    static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ", binary:\n   " + Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + l + ", binary:\n    " + Long.toBinaryString(l));
    }
}

class RightShiftTest {

    public static void main(String[] args) {
        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for (int i = 0; i < 28; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}

class RightShiftTest2 {

    public static void main(String[] args) {
        int h = -1;
        System.out.println(Integer.toBinaryString(h));
        h <<= 10;
        System.out.println(Integer.toBinaryString(h));
        for (int i = 0; i < 32; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}

class CharBinaryTest {

    public static void main(String[] args) {
        char c = 'a';
        System.out.println(Integer.toBinaryString(c));
        c = 'b';
        System.out.println(Integer.toBinaryString(c));
        c = 'c';
        System.out.println(Integer.toBinaryString(c));
        c = 'd';
        System.out.println(Integer.toBinaryString(c));
        c += 1;
        System.out.println(Integer.toBinaryString(c));
        c = 'A';
        System.out.println(Integer.toBinaryString(c));
        for (int i = 0; i < 26; i++) {
            c += 1;
            System.out.println(Integer.toBinaryString(c));
        }
    }
}
