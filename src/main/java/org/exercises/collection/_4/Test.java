package org.exercises.collection._4;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

    static void main() {

        Collection<String> list = new ArrayList<>(); //cria uma Collection com Generic String e instancia um ArrayList

        list.add("Anamaria");
        list.add("Anamaria"); //List permite duplicados

        System.out.println(list.isEmpty()); //metodo que verifica se a Collection esta vazia, caso sim retorna true ou false caso não
        System.out.println(list.size()); //metodo que retorna o tamanho da Collection
    }

    //usar os metodos para contar elementos. isEmpty() e size()
    //com o isEmpty() verificamos se uma Collection esta vazia, retorna true ou false
    //com o size() verificamos o tamanho da Collection, retorna true ou false
}
