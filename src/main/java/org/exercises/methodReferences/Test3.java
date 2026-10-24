package org.exercises.methodReferences;

import java.util.ArrayList;

public class Test3 {

    static void main() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bia");
        names.add("Carlos");

        names.forEach(System.out::println); //usamos method references para imprimir o ArrayList
        names.forEach(n -> System.out.println(n)); //usamos lambda expression para imprimir o ArrayList
        System.out.println(names);
    }


}
