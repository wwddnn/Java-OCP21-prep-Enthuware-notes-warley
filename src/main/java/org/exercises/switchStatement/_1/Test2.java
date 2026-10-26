package org.exercises.switchStatement._1;

public class Test2 {

    public void switchString(String input) {
        switch (input) {
            case "a":
                System.out.println("apple");
            case "b":
                System.out.println("bat");
                break;
            case "B":
                System.out.println("big bat");
            default:
                System.out.println("none");
        }
    }

    public static void main(String[] args) throws Exception {
        var tc = new Test2(); //cria um objeto do tipo Test2
        tc.switchString("B");//com esse objeto criado, é chamado o metodo switchString() que passa o parametro "B".
        // essa String vai para o switch que tem a case "B" e retorna "big bat" e o default "none"
    }

}
