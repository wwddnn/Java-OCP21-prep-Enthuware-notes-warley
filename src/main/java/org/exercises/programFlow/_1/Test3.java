package org.exercises.programFlow._1;

public class Test3 {

    public static void main(String[] args) throws Exception {
        var sa = new String[]{"a", "b", "c"};
        for(String s :  sa){
            if("b".equals(s)) continue;
            System.out.println(s);
            if("b".equals(s)) break;
            System.out.println(s+" again");
        }
    }
    //sa representa um array com 3 elementos. com o loop for iteramos sobre o array.
    //primeiro a variavel s = "a", passa pela primeira iteracao no loop for e imprime a depois a "again"
    //na segunda iteracao do loop for s = "b" porem ao entrar no if temos um continue que vai pular para o final do loop
    //entao vamos para a terceira iteracao do loop for s = "c" que imprime c e depois c "again"
}
