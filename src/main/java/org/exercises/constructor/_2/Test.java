package org.exercises.constructor._2;

public class Test {
    long bb;
    public void Test(long bb){};

    static void main() {
        Test a, b;
        a = new Test(); //cria um novo objeto. e compila sim pois Test() é um metodo, e nesse caso Test() sem parametro chama o construtor da classe, portanto o codigo compila ja que o construtor é default nesse caso
        //b = new Test(5); //cria um novo objeto. nao compila, pois o 5 como parametro indica que queremos o construtor com parametros, o que nao existe nesse caso, so existe o construtor sem parametros
    }
    //questao sobre construtor
    //a classe Test tem nesse exemplo a variavel bb, e tem o metodo Test() que parece com o construtor default Test() da classe
    //ideia da questao é confundir sobre o uso do construtor default e do metodo Test()
    //e quando chamamos o Test() na linha 9, estamos chamando o construtor default da class, tudo certo, nao tem parametros
    //e quando chamamos o Test() na linha 10 estamos chamando o construtor com parametros o que nao existe, entao nao compila. o que temos é o construtor sem parametros default.
}
