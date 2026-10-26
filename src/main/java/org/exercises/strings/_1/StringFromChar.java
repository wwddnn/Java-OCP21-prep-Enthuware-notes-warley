package org.exercises.strings._1;

public class StringFromChar {
    static void main() {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};

        String newStr = "";
        for(char ch: myCharArr){
            newStr += ch;
        }

        boolean b1 = newStr == myStr;
        boolean b2 = newStr.equals(myStr);

        System.out.println(b1 + " " + b2);
    }
    //no final de cada iteracao do for, é criada uma string diferente ate que no final temos a string newStr que aponta para local diferente de myStr
    //ja em relacao ao conteudo eles sao iguais good entre myStr e newStr, entao quando usamos equals() o resultado é true
}
