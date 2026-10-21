package org.exercises.stream;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    static void main() {
        List<Integer> al = Arrays.asList(100, 200, 230, 291, 43);

        System.out.println(al.stream().filter(i -> i <           200).count());
    }
    //questão sobre stream. primeiro criamos um Array com 5 elementos. Depois colocamos ele dentro de uma Lista de Integer.
    //a seguir transformamos essa lista para stream() e usamos o filter() para filtrar os valores que sao menores que 200.
    //e para finalizar o stream, pois esse tem operacoes de inicio meio a fim, usamos a operacao fim com o metodo count() que traz a quantidade de elementos filtrados
    //resultado sera 2 elementos que sao 43 e 100
}
