package operator;
//: operators/Literals.java

public class Literals {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int i1 = 0x2f; // Hexadecimal (lowercase)
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // Hexadecimal (uppercase)
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // Octal (leading zero)
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // max char hex value
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // max byte hex value
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // max short hex value
        System.out.println("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // long suffix
        long n2 = 200l; // long suffix (but can be confusing)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // float suffix
        float f3 = 1f; // float suffix
        double d1 = 1d; // double suffix
        double d2 = 1D; // double suffix
        // (Hex and Octal also work with long)
    }
}

class LongValues {
    public static void main(String[] args) {
        long n1 = 0xffff; // hexadecimal
        long n2 = 077777; // octal
        System.out.println("long n1 in hex = " + Long.toBinaryString(n1));
        System.out.println("long n2 in oct = " + Long.toBinaryString(n2));
    }
}

// 把Integer转换为Binary的过程写出来

class TestF {

    public static void main(String[] args) {
        // output:1000
        System.out.println(toBinaryString(8));
         printInfo();
    }

    /**
     * 这里是做&操作的测试，也就是说，在1&*（其中*代表其他数字，如：0,1,2,3,4...）操作的时候 他们是进行二进制之间的&(与)运算操作。只有当*为奇数（1,3,5,7...）的时候，1*&操作才可以返回：1
     * 其他情况返回：0
     */
    private static void printInfo() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i= " + i + "         " + (i & 1));
        }
    }

    public static String toBinaryString(int i) {
        return toUnsignedString(i, 1);
    }

    /**
     * Convert the integer to an unsigned number.
     */
    private static String toUnsignedString(int i, int shift) {
        char[] buf = new char[32];
        int charPos = 32;
        int radix = 1 << shift;
        int mask = radix - 1;
        do {
            // 这里的mask一直为：1，所以当i为奇数的时候，这里"i & mask"操作才为：1
            // 否则返回：0
            // System.out.println(i & mask);
            buf[--charPos] = digits[i & mask];
            i >>>= shift;// 右移赋值，左边空出的位以0填充
            // System.out.println(buf);
            // System.out.println(charPos);
            // System.out.println(i);
        } while (i != 0);
        return new String(buf, charPos, (32 - charPos));
    }

    final static char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
}
