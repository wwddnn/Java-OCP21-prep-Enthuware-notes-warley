package org.exercises.ooa;

public class Test3 {
    public static void main(String[] args) {
        someMethod(23);
    }

    static void someMethod(Object... params) {
        System.out.println(params.length);
    }

    //no metodo someMethod foi passado como parametro um varargs de Object e imprime o tamanho desse varargs
    // nesse caso quando chamamos o metodo someMethod nao colocamos parametro dentro, entao vai retornar zero, e se colocar parametro ira retornar o tamanho do parametro
}
