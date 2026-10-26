package org.exercises.functionalInterfaces._6;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

    static void main() {

        //Metodos convenientes para serem usados por qualquer interface funcional


        //-----------------------------------------------------------//


        //na interface funcional PREDICATE, usamos o seu metodo que é o test() e vai retornar true ou false

        Predicate<String> lambda = s -> s.contains("banana");
        Predicate<String> lambda2 = s -> s.contains("chocolate");

        Predicate<String> lambdaPlusLambda2 = lambda.and(lambda2); //usamos o metodo AND para juntar dois predicates e criar um novo predicate
        Predicate<String> otherLambda = lambda.and(lambda2.negate()); //usamos o metodo AND e NEGATE para criar um novo predicate

        System.out.println(lambdaPlusLambda2.test("banana chocolate")); //retorna true pois contem tanto a palavra banana quanto chocolate
        System.out.println(lambdaPlusLambda2.test("chocolate banana")); //retorna true pois contem tanto a palavra chocolate quanto banana


        //--------------------------------------------------------//

        //na interface funcional CONSUMER, usamos o seu metodo que é o accept() e vai retornar true ou false

        Consumer<String> c1 = c -> System.out.println("1: " + c);
        Consumer<String> c2 = c -> System.out.println(",2: " + c);

        Consumer<String> c3 = c1.andThen(c2); //criamos um novo CONSUMER c3 usando o metodo andThen() para juntar as duas outras CONSUMER c1 e c2
        c3.accept("Annie"); //usamos o metodo accept() que é da interface CONSUMER


        //----------------------------------------------------------//

        //na interface funcional FUNCTION, usamos o seu metodo que é o apply()

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;

        Function<Integer, Integer> combined = after.compose(before); //criamos uma nova FUNCTION e usamos o metodo compose() que é um metodo conveniente para usar em interfaces funcionais
        System.out.println(combined.apply(3)); //usamos esse 3 dentro do before, que tera o resultado de 3+1=4. entao esse 4 usamos dentro do after que tera o resultado 4*2=8. entao 8 sera impresso.


    }
}
