package org.exercises.interfaceFuncional;

public class Main {
    public static void main(String[] args) {
        // implementando a interface funcional Run. expressão lambda esta sem parâmetro, então se faz obrigatório usar parênteses
        Run runner = () -> System.out.println("run com lambda");

        //implementando a interface funcional CalcMath.
        //tipo sem parametros de forma mais simples, e flecha e chaves com return e ponto e virgula no final obrigatorio, tudo ok
        CalcMath soma = (a, b) -> { return a + b;};

        //tipo com parâmetros e flecha e corpo simples sem return e sem chaves, tudo ok
        CalcMath multi = (int c, int d) -> c  * d;

        System.out.println(soma.canCalc(10, 20)); //result 30
        System.out.println(multi.canCalc(1, 4)); //result 4

    }
}
