package org.exercises.arrays1;
import java.util.Arrays;
public class Array2 {
    static void main() {
        int[] idades;
        idades = new int[3];
        idades[0] = 8;
        idades[1] = 42;
        idades[2] = 42;
        Arrays.sort(idades);
        System.out.print("ordered:");
        System.out.println(Arrays.toString(idades));
        System.out.print("length: ");
        System.out.println(idades.length);
    }
}
