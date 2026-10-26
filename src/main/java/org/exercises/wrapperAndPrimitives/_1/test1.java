package org.exercises.wrapperAndPrimitives._1;

public class test1 {

    static void main() {

        float foo = 2, bar = 3, baz = 4;
        float mod1 = foo % baz, mod2 = baz % foo;  //mod1 = 2  e mod2 = 0
        float val = mod1>mod2? bar : baz;  //val = mod1 > mod2 : true, logo a resposta é val = bar, que é igual a 3
        System.out.println(val); //imprime na tela o 3 que é um numero de ponto flutuante, logo imprime 3.0

        //obs. nao imprime 3.0f por que essa é uma anotacao que indica ao compilador que esse numero é um float (32bits) ao inves de um double (64bits)...
        //... é um instrução de compilação e não faz parte do número em si.

    }
}
