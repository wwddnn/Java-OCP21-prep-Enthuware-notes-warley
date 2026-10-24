package org.exercises.ooa;

public class Test6 {

    private int myValue = 0; //declara uma variavel de classe com valor zero

    public void showOne(int myValue) {
        myValue = myValue; //atribui o valor do parametro para a variavel local interna do metodo myValue
    }

    public void showTwo(int myValue) {
        this.myValue = myValue; //atribui o valor do parametro para a variavel da classe myValue pois usa o comando this para isso
    }

    public static void main(String[] args) {
        var ct = new Test6(); //cria um novo objeto do tipo Test6
        ct.showTwo(200); //atribui o valor 200 a variavel da classe myValue atraves do uso do this
        System.out.println(ct.myValue); //como a variavel da classe foi alterada de zero para 200, sera impresso o valor 200
        ct.showOne(100); //atribui o valor 100 para a variavel local do proprio metodo, e nao para variavel da classe
        System.out.println(ct.myValue); //como a variavel da classe myValue não foi alterada dessa vez, entao ela mantem o valor que foi alterado no metodo showTwo() que é de 200
    }
    //questao sobre ooa fields and methods.
    //importante entender o valor do this para fazer referencia a variavel da classe
    //quando nao usa o this é porque o metodo faz referencia a sua propria variavel local
}
