package org.exercises.ooa._2;

public class Test4 {

    private int myValue = 0;

    public void showOne(int myValue) {
        myValue = myValue; //o parametro myValue atribui a propia variavel o valor que chegou, neses caso atribui 100
        System.out.println(this.myValue); //esse this faz referencia a variavel da classe myValue, logo a mesma tem valor de zero quando declarada
    }

    public void showTwo(int myValue) {
        this.myValue = myValue; //esse this faz referencia a variavel da classe myValue e atribui o valor do parametro que chega para ela, nesse caso o valor 200
        System.out.println(this.myValue); //ao imprimir é usado o this que faz referencia a essa variavel myValue da classe, logo imprime 200
    }

    public static void main(String[] args) {
        var ct = new Test4();
        ct.showOne(100); //passa o valor 100 para a variavel do metodo e nao para a variavel da classe
        ct.showTwo(200); //passa o valor 200 para a variavel da classe pois usa o this quando faz a referencia
    }

    //questao sobre orientacao a objetos e campos e metodos
    //importante entender que o this quando usado na variavel se refere a variavel da classe, e quando nao temos o this se revere a variavel local do proprio metodo
}
