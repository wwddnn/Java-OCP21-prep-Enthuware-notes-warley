package org.exercises.arrays1;
import java.util.Arrays;
public class Array1 {
    static void main() {
        double[] notas = new double[5];
        notas[0] = 10.0;
        notas[1] = 9.0;
        notas[2] = 8.5;
        notas[3] = 7.5;
        notas[4] = 6.0;
        System.out.print("without sort:");
        System.out.println(Arrays.toString(notas));
        System.out.print("with sort:");
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));
        System.out.print("Length: ");
        System.out.println(notas.length);
        System.out.print("for:");
        for(double nota : notas) {
            System.out.println(nota);
        }
    }
}
