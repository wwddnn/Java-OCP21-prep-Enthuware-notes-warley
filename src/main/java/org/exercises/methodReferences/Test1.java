package org.exercises.methodReferences;

public class Test1 {

    @FunctionalInterface //é uma interface funcional pois so tem 01 metodo abstrato
    interface Converter {
        long round(double num); //criamos uma interface com metodo que tem um parametro
    }

    static void main() {
        Converter methodRef = Math::round; //usamos metodo references. o simbolo :: é como o lambda e faz referencia a interface funcional
        Converter lambda = x -> Math.round(x); //podemos usar lambda tambem, passando o parametro nesse caso

        System.out.println(methodRef.round(1.6));//chamamos o methodRef o metodo da interface. nesse caso round() é um static method
    }
}
