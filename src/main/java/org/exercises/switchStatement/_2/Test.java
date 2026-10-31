package org.exercises.switchStatement._2;

public class Test {

    public static void main() {
        int x = 4;
        switch(x) {
            case 1, 2 -> System.out.println("A");
            case 3, 4 -> System.out.println("B");
            default -> System.out.println("C");
        }
    }

    //questao sobre switch na sua versao com funcão de seta.
    //dentro do metodo main, temos a variavel x valendo 4.
    //depois o x é avaliado dentro do switch, que leva para o case 3, 4 e que imprime B
    //e o programa termina.
    //nao entra no default porque temos o switch versao nova com seta, se fosse o switch antigo com dois pontos :  ai sim entraria no default, ou entao para nao entrar nele teriamos que usar o break.
}
