package org.exercises.methodReferences._1;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test6 {

    static void main() {
        Consumer<String> consu = System.out::println; //usamos method references para implementar a interface funcional CONSUMER
        Consumer<String> consu2 = s -> System.out.println(s); //tambem podemos usar lambda expression

        consu.accept("Hello"); //cria uma String ao chamar o objeto e o metodo accept() da interface funcional da CONSUMER
        consu2.accept("World");

        var map = new HashMap<String, Integer>(); //cria o map
        BiConsumer<String, Integer> b1 = map::put; //usa o method references para implementar a interface funcional BICONSUMER
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);//podemos usar lambda tambem

        b1.accept("Home", 1);//chamamos o objeto criado e usamos o metodo da interface funcional BICONSUMER accept()
        b2.accept("Clean", 2);

        System.out.println(map);

        var map2 = new HashMap<String, String>(); //cria um map
        BiConsumer<String, String> b3 = map2::put; //usa method references para implementar a interface funcional BICONSUMER
        BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v); //pode usar usa lambda tambem

        b3.accept("Test", "123"); //chama esse objeto e o metodo do BICONSUMER accept()
        b4.accept("Testing", "456");

        System.out.println(map2); //imprime o map
    }

    //CONSUMER interface funcional, ela consome algo mas naso retorna nada.
    //BICONSUMER é semelhante so que tem 2 parametros
    //ambas tem um metodo chamado accept() que nao retorna nada
}
