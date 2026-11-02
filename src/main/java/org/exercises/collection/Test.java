package org.exercises.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Test {

    static void main() {
        Collection<String> string = new ArrayList<>(); //usamos diamond operator do lado direito, onde omitimos o tipo Generic

        var hash = new HashSet<Integer>(); //usamos o var, para uma versao mais curta da Collection

        var map = new HashMap<>(); //usamos o var, e nao colocamos o tipo do lado direito, o compilador vai reconhecer um Object como tipo Generic
    }

    //sao formas de escrever uma versao curta do Collection com Generics
    //primeiro criamos um ArrayList de uma forma tradicional com uso do diamond operator do lado direito e nao precisamos escrever o tipo generic
    //depois criamos um HashSet usando var
    //depois criamos um HashMap usando var porem sem colocar o tipo Generic do lado direito, entao o compilador reconhece como tipo Object
}
