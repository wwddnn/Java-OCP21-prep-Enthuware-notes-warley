package org.exercises.functionalInterfaces._6;

import java.util.function.Predicate;

public class Test {

    static void main() {

        //Metodos convenientes para serem usados por qualquer interface funcional

        Predicate<String> lambda = s -> s.contains("banana");
        Predicate<String> lambda2 = s -> s.contains("chocolate");

        Predicate<String> lambdaPlusLambda2 = lambda.and(lambda2); //usamos o metodo AND para juntar dois predicates e criar um novo predicate
        Predicate<String> otherLambda = lambda.and(lambda2.negate()); //usamos o metodo AND e NEGATE para criar um novo predicate

        System.out.println(lambdaPlusLambda2.test("banana chocolate")); //retorna true pois contem tanto a palavra banana quanto chocolate
        System.out.println(lambdaPlusLambda2.test("chocolate banana")); //retorna true pois contem tanto a palavra chocolate quanto banana

        //no caso da interface funcional PREDICATE usamos o seu metodo que é o test() e vai retornar true ou false.
    }
}
