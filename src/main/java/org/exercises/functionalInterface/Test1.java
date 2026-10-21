package org.exercises.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    static void main() {
        String[] sa = {"charlie", "bob", "andy", "dave"};
        var ls = new ArrayList<String>(Arrays.asList(sa));
        ls.sort((var a, var b) -> a.compareTo(b));
        System.out.println(sa[0] + " " + ls.get(0));
    }
    //criamos um Array de String chamado sa.
    //criamos um novo objeto ArrayList onde teremos os mesmos elementos do Array sa. Esses dois objetos não tem relacao entre si pois usamos o new ArrayList para cria-lo
    //se tivesse usado Arrays.asList(sa) sem o new ArrayList() entao os objetos teriam uma relacao entre si
    //usamos o metodo sort() e compareTo() para colocar em ordem os elementos do ArrayList. usamos interface funcional com expressao lambda.
    //imprimimos o primeiro elemento do Array sa, e imprimimos o primeiro elemento do ArrayList ls
    //como são objetos diferentes, e somente o ArrayList foi colocado em ordem, o resultado é charlie andy
}
