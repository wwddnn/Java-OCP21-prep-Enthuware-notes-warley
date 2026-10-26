package org.exercises.functionalInterfaces._3;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test {
    //CONSUMER E BICONSUMER = sao interfaces funcionais que so consomem algo e nao retornam nada
    //tem o metodo accept()

    static void main() {

        Consumer<String> methodRef = System.out::println; //usamos o method references para implementar a interface funcional CONSUMER
        Consumer<String> lambda = x -> System.out.println(x); //podemos usar tambem o lambda

        methodRef.accept("Hello"); //chamamos o metodo accept() que é da interface funcional CONSUMER
        lambda.accept("World");

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> methodRef2 = map::put;
        BiConsumer<String, Integer> lambda2 = (k, v) -> map.put(k, v);

        methodRef2.accept("key", 10);
        lambda2.accept("key2", 20);

        System.out.println(map);

    }
}
