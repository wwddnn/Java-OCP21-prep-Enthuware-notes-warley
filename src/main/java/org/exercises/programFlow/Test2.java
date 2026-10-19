package org.exercises.programFlow;

public class Test2 {
    static void main() {
        String[] dataList = {"x", "y", "z"};

        for (var dataElement : dataList) {
            int innerCounter = 0;
            while (innerCounter < dataList.length) {
                System.out.println(dataElement + ", " + innerCounter);
                innerCounter++;
            }
        }
    }
    //o tamanho do array datalist.length = 3;
    //primeiro vai percorrer o loop for em todos os elementos do array x y z;
    //depois vai entrar no loop while e fazer a condição enquanto a vari[avel innerCounter for menor que o tamanho do array 3;
    //por fim vai imprimir para cada elemento do array x y z, um contador que vai do 0 ao 2.
    //atenção porque após terminar cada loop do while, retornamos para o loop for e vamos percorrer cada elemento x y z do array.
}
