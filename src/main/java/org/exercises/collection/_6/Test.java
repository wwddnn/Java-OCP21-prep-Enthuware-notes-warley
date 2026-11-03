package org.exercises.collection._6;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

    static void main() {

        Collection<String> list = new ArrayList<>(); //cria uma Collection com Generic String e instancia um Arraylist

        list.add("Carlos"); //adiciona o elemento Carlos
        list.add("Dario"); //adiciona o elemento Dario

        System.out.println(list.contains("Carlos")); //usa o metodo contains() e verifica se contem o elemento Carlos dentro da Collection. resultado true
        System.out.println(list.contains("Renato")); //usa o metodo contains() e verifica se contem o elemento Renato dentro da Collection. resultado false
    }

    //Sobre Collections e o uso do metodo contains() que procura se a Collection tem ou não esse elemento, caso sim retorna true, ou caso não retorna false
}
