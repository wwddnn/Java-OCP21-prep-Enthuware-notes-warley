package org.exercises.functionalInterfaces._5;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Test {

    static void main() {

        //UNARYOPERATOR E BINARYOPERATOR sao interfaces funcionais que sao casos especiais de FUNCTION.
        //é necessario que todos os parametros sejam do mesmo tipo
        //usa o mesmo metodo apply() que existe na function

        UnaryOperator<String> methodRef = String::toUpperCase;
        UnaryOperator<String> lambda = s -> s.toUpperCase();

        System.out.println(methodRef.apply("hello"));
        System.out.println(lambda.apply("world"));


        BinaryOperator<String> methodRef2 = String::concat;
        BinaryOperator<String> lambda2 = (s1, s2) -> s1.concat(s2);

        System.out.println(methodRef2.apply("My", "Home"));
        System.out.println(lambda2.apply("My", "House"));

    }
}
