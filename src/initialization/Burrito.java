package initialization;
//: initialization/Burrito.java

import initialization.EnumEx21.Bills;

public class Burrito {

    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
        case NOT:
            System.out.println("not spicy at all.");
            break;
        case MILD:
        case MEDIUM:
            System.out.println("a little hot.");
            break;
        case HOT:
        case FLAMING:
        default:
            System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT), greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}

// initialization/EnumEx21.java
// TIJ4 Chapter Initialization, Exercise 21, page 207
/*
 * Create an emun of the least-valuable six types of paper currency. Loop through the values() and print each value and
 * its ordinal().
 */

class EnumEx21 {

    public enum Bills {
        ONE,
        FIVE,
        TEN,
        TWENTY,
        FIFTY,
        HUNDRED
    }

    public static void main(String[] args) {
        for (Bills b : Bills.values())
            System.out.println(b + ", ordinal " + b.ordinal());
    }
}

// initialization/Wallet.java
// TIJ4 Chapter Initialization, Exercise 22, page 207
/*
 * Write a switch statement for the enum in the previous example. For each case, output a description of that particular
 * currency.
 */

/*
 * use enum: public enum Bills { ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED }
 */

class Wallet {

    public static void main(String[] args) {
        for (Bills b1 : Bills.values()) {
            System.out.print("Worth: ");
            switch (b1) {
            case ONE:
                System.out.println("$1");
                break;
            case FIVE:
                System.out.println("$5");
                break;
            case TEN:
                System.out.println("$10");
                break;
            case TWENTY:
                System.out.println("$20");
                break;
            case FIFTY:
                System.out.println("$50");
                break;
            case HUNDRED:
                System.out.println("$100");
                break;
            default:
                break;
            }
        }
    }
}
