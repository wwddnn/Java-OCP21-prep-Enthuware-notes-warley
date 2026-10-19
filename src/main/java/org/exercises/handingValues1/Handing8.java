package org.exercises.handingValues1;

public class Handing8 {
    static void main() {
        int i = 5;
        float f = 5.5f;
        double d = 3.8;
        char c = 'a';
        if (i == f) c++;       //i vale 5, f vale 5.5f, portanto são valores diferentes pois um int não é igual a um float ponto flutuante
        if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
        //primeira parte da equação: primeiro fazemos a operação dentro do parênteses que será 5.5 + 3.8 o resultado será 9.3 então transformamos para int que será 9
        //segunda parte da equação: fazemos de forma independente a variavel f e também a variável d. o resultado será 5 + 3 = 8
        //portanto como são valores diferentes o valor de c não será incrementado, logo o resultado impresso abaixo será a própria variável c = 'a'.
        System.out.println(c);
    }

}

