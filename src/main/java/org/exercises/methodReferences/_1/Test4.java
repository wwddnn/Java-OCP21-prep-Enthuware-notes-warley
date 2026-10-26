package org.exercises.methodReferences._1;

public class Test4 {

    @FunctionalInterface
    interface IsEmpty {
        boolean isEmpty(String string);
    }

    static void main() {
        IsEmpty methodRef = String::isEmpty; //method references
        IsEmpty lambda = s -> s.isEmpty(); //lambda expression

        System.out.println(methodRef.isEmpty("Calm"));

    }

    //teoria sobre method references e lambda para implementar interface funcional
    //criamos interface funcional para saber se uma String é vazia, caso sim retorna true e caso contrario false
}
