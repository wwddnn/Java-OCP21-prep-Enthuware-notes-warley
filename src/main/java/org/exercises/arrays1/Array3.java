package org.exercises.arrays1;
public class Array3 {
    static void main() {
        boolean[] b1 = new boolean[2];
        boolean[] b2 = new boolean[]{true, false};
        System.out.println("" + (b1[0] == b2[0]) + ", " + (b1[1] == b2[1]) );
    }
}
