package access.local;


//TIJ4 chapter Access, Exercise 9, page 233
/* Create in access/local directory in your CLASSPATH:
* // access/local/PackagedClass.java
* package access.local;
*/
class PackagedClass {

    public PackagedClass() {
        System.out.println("Creating a packaged class");
    }
}

//class Foreign {
//
//    @SuppressWarnings("unused")
//    public static void main(String[] args) {
//        PackagedClass pc = new PackagedClass();
//    }
//}
