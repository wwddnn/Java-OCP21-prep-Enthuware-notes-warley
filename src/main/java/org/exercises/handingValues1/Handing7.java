package org.exercises.handingValues1;

public class Handing7 {
    public static void main(String args[]){
        char c;
        int i;
        c = 'a';//1
        i = c;  //2
        i++;    //3
        //c = i;  //4
        c++;    //5
    }
    //assunto sobre casting e promoção de variáveis
    //linha 1 o código compila pois um primitivo char esta sendo atribuído a uma variável do tipo char c
    //linha 2 o código compila pois um primitivo char c esta sendo atribuido a uma variável i int. lembrar que um char cabe dentro de um int, é feito um casting implícito para isso
    //linha 3 o código compila pois ocorre um incremento em um primitivo inteiro
    //linha 4 o código não compila pois não se pode atribuir um primitivo char para dentro de um int sem fazemos o casting explícito. nesse caso ocorre erro de compilação.
}
