package org.exercises.collection._3;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

    static void main() {

        Collection<String> list = new ArrayList<>();

        list.add("Anamaria"); //adiciona o elemento Anamaria na list
        list.add("Anamaria"); //adiciona mais um elemento Anamaria na list. por ser uma List é permitido elementos duplicados

        System.out.println(list.remove("Anamaria")); //remove um elemento Anamaria
        System.out.println(list); //exibe todos os elementos da lista
    }

    //usar o metodo remove() faz com que um elemento da Collection seja removido
}
