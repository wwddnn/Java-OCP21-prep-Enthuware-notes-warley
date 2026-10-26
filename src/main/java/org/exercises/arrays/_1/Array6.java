package org.exercises.arrays._1;

import java.util.Arrays;

public class Array6 {

    static void main() {
        int[] a = {1,2,3,4,1000, 2000, 3000, 4000};
        int[] b = {1,2,3,4,900,99,700};
        int[] c = {1,2,3};
        int[] d = {1,2,3,4};
        int[] e = {1,1,1,1,1,1,1,1}; //smaller because has 1 1 1 1 1 1 not compare length here

        int x = Arrays.compare(a, b);
        int y = Arrays.compare(a, c);
        int z = Arrays.compare(a, d);
        int w = Arrays.compare(c, d);
        int ww = Arrays.compare(e, b);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.out.println(ww);

        int r = Arrays.mismatch(a,b);
        int s = Arrays.mismatch(c,e);
        int t = Arrays.mismatch(b,d);

        System.out.println("----------------------");
        System.out.println(r);
        System.out.println(s);
        System.out.println(t);

    }
}
