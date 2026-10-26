package org.exercises.functionalInterfaces._4;

import java.util.function.Predicate;

public class Test {

    static void main() {

        //PREDICATE e BIPREDICATE sao usados para filtros ou matching. sao operacose comuns.
        //seu metodo é o test()

        Predicate<String> methodRef = String::isEmpty; //criamos um method references para implementar a interface funcional PREDICATE
        Predicate<String> lambda = s -> s.isEmpty(); //podemos usar lambda tambem

        System.out.println(methodRef.test("")); //vai retornar true
        System.out.println(lambda.test("nooo")); //vai retornar false

    }
}
