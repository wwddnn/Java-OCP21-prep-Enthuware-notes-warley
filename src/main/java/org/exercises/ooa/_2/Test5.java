package org.exercises.ooa._2;

public class Test5 {
    private int myValue = 0;

    public void showOne(int myValue) {
        myValue = myValue; //recebe o valor do parametro e coloca na variavel do proprio metodo myvalue, ou seja. nao altera o valor da variavel da classe myvalue
    }

    public void showTwo(int myValue) {
        this.myValue = myValue; //recebe o valor do parametro e altera o valor da variavel da classe myValue para 200 nesse caso
    }

    public static void main(String[] args) {
        var ct = new Test5(); //cria um novo objeto do tipo Test5
        ct.showOne(100); //atribui o valor 100 para a variavel do proprio metodo showOne()
        System.out.println(ct.myValue); //imprime o valor da variavel myValue que esta dentro do objeto ct, nesse caso como nao foi alterado esse valor, imprime zero
        ct.showTwo(200); //atribui o valor 200 a variavel da classe myValue, pois dentro do metodo showTwo() faz referencia ao this.myValue, logo esse valor passa a ser 200
        System.out.println(ct.myValue); //imprime o valor de 200 da variavel da classe myValue
    }
}
