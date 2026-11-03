package org.exercises.collection._5;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

    static void main() {

        Collection<String> list = new ArrayList<>(); //cria uma Collection com Generic String e instancia um Arraylist

        list.add("Bianca");
        list.add("Bianca");

        System.out.println(list.isEmpty()); //verifica se a Collection esta vazia
        System.out.println(list.size()); //verifica o tamanho da Collection

        list.clear(); //limpa toda a Collection

        System.out.println(list.isEmpty()); //retirna true pois a Collection esta vazia
        System.out.println(list.size()); //retorna zero pois a Collection esta vazia
    }

    //sobre Collection e o metodo clear() que limpa todos os elementos da Collection
    //podemos usar o metodo isEmpty() e size() para verificar
}
