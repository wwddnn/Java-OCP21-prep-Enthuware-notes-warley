package org.exercises.loops._1;

public class Test1 {
    static void main() {
        int[] values = {10, 20, 30};
        for(int k : values);//é valido pois realiza um loop for para o ArrayList
        //for(var k; k < 0; k++);não é valido pois nao inicializa o k. deveria ser for(k=0; k<0; k++)
        //for( ; ; ) //casusa um loop infinito mas é um codigo valido
        //for( ; k<values.length; k++) //nao é valido, é preciso inicializar o k primeiro. deveria ser for(k=0; k<values.length; k++)
    };
    //a questao trata de loop for
    //é necessário que a variavel seja inicializada se fizermos o loop for tradicional
}
