package org.exercises.overload;

public class Test1 {

    void perform_work(int time) {};
    int perform_work(int time, int speed) {return time * speed; }; //compila, metodos com mesmo nome e lista de parametros diferentes, é um overloading

    void perform_work2(int time) {};
    //int perform_work2(int speed){return speed; }; //nao compila, metodos com mesmo nome e mesma lista de parametros. deveria ter lista de parametros diferentes para ser overloading

    void perform_work3(int time) {};
    void Perform_work3(int time) {}; //metodos de nomes diferentes, o segundo metodo tem P maiusculo no comeco. nao sao overloading. codigo compila sim.

    //obs. a questao trata de overloading que sao metodos com mesmo nome e lista de parametros diferentes.
    //importante mencionar que o nome do parametro e o tipo de retorno do metodo nao importam para overloading.
    // por exemplo no metodo abaixo vemos que o tipo de retorno do metodo int, e o nome do parametro ser 'time' nao sao considerados para um overloading de metodos
    // int perform_work(int time) {};

}
