package org.exercises.ooa._2;

public class Test2 {
    public static void main(String args[]) {
        Test2 obj = new Test2(5);
    }

    int m;
    static int i1 = 5;
    static int i2;
    int j = 100;
    int x;

    public Test2(int m) {
        System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
    }

    { j = 30; i2 = 40; } //Instance Initializer //bloco de inicializacao

    static {i1++;} //Static Initializer //bloco estatico
}

//essa questao trata da ordem de inicializacao em Java
//primeiro inicializa os membros estaticos na ordem que aparecem. i1=5 e i2=0
//depois o bloco estatico i1++ onde i1=6
//agora inicializa os membros de instancia na ordem que aparecem j=100 e x=0
//agora o bloco de inicializacao onde valor de j muda para j=30 e o i2 muda para i2=40
//por fim o construtor new Test2(5) onde m=5
//o resultado final para ser impresso sera 6 40 0 30 5
