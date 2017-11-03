package control;
import java.util.HashMap;

public class MyTest {

    @SuppressWarnings({"rawtypes", "unchecked" })
    public static void main(String[] args) {

        HashMap i1 = new HashMap(2);
        i1.put("1", 1);
        testMap(i1);
        System.out.println("i1:" + i1);

        Integer a1 = 100;
        test1(a1);
        System.out.println("a1:" + a1);
    }

    @SuppressWarnings({"rawtypes", "unchecked" })
    public static void testMap(HashMap i) {
        // i = new HashMap(1);
        i.put("2", 2);
    }

    public static void test1(Integer i) {
        i++;

        System.out.println("i:" + i);
    }
}

class TempTest {

    private void test1(A a) {
        a.age = 20;
        System.out.println("test1方法中的age=" + a.age);
    }

    public static void main(String[] args) {
        TempTest t = new TempTest();
        A a = new A();
        a.age = 10;
        t.test1(a);
        System.out.println("main方法中的age=" + a.age);
    }
}

class A {

    public int age = 0;
}
