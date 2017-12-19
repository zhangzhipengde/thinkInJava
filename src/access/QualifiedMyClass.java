package access;
//: access/QualifiedMyClass.java

public class QualifiedMyClass {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        access.mypackage.MyClass m = new access.mypackage.MyClass();
    }
}
