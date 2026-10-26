package org.exercises.interfaces._1;

public class Sample implements IInt{
    static void main() {
        Sample s = new Sample();
        int j = s.theValue;
        System.out.println(j);
        int k = IInt.theValue;
        System.out.println(k);
        int l = theValue;
        System.out.println(l);

    }
}
