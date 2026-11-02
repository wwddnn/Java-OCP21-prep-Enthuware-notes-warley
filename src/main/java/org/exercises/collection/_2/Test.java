package org.exercises.collection._2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Test {

    static void main() {
        Collection<String> list = new ArrayList<>(); //cria uma Collection do tipo Generic String, que é um ArrayList que permite duplicado

        System.out.println(list.add("Anamaria"));
        System.out.println(list.add("Anamaria"));

        Collection<String> list2 = new HashSet<>(); //cria uma Collection do tipo Generic String, que é um HashSet que nao permite elementos duplicados

        System.out.println(list2.add("Anamaria"));
        System.out.println(list2.add("Anamaria")); //resulta em false, pois no HashSet que é um Set não se pode duplicar elementos
    }

    //metodo add() para a Collection
    //retorna true ou seja um Boolean se adicionar o elemento, ou false se nao adicionar
}
