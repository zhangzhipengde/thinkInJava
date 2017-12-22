package reusing;
//: reusing/Lisa.java

import static net.mindview.util.Print.print;

// {CompileTimeError} (Won't compile)

class Lisa extends Homer {

//    @Override
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
    @Override
    float doh(float f) {
        print("doh(float)");
        return 1.0f;
    }
}
