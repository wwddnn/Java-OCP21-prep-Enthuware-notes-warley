package org.exercises.switchStatement._1;

public class Test1 {
    public void switchString(String input){
        switch(input){
            case "a" : System.out.println( "apple" );
            case "b" : System.out.println( "bat" );
            break;
            case "c" : System.out.println( "cat" );
            default : System.out.println( "none" );
        }
    }

    public static void main(String[] args) throws Exception {
        var test1 = new Test1();
        test1.switchString("c");
    }

    //no metodo main temos a criacao de um objeto do tipo Test1 usando a palavra reservada 'new' ...
    //... em seguida esse objeto criado chama o metodo switchString() que passa como parametro a String "c" ...
    //... quando essa String chega no switch será procurado dentre as cases se existe "c", nesse caso sim, então será impresso "cat" pois essa é a sentença dessa case "c" ...
    // ... e seguimos para a linha abaixo onde tem a case default que será impressa justamente porque não tem um comando break abaixo da case "c".
}
