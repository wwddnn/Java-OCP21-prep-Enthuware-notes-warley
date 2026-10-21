package org.exercises.varargs;

public class Test1 {
    public void myMethod(String... params) {
        var a = params;
        var b = params[0];
    }
    //qual o tipo de cada variavel, a e b respectivamente?
    //o parametro do metodo myMethod é um array de Strings
    //var a sera um array de strings
    //var b sera uma String, pois params[0] é um array na posicao zero o que gera uma string
}
