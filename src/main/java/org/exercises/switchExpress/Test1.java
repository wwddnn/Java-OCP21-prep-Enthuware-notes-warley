package org.exercises.switchExpress;

public class Test1 {

    public static void main(String[] args) {
        calculate(2);
    }

    public static void calculate(int x) {
        final int TWO = 2;
        String val =
                switch (x) {
                    //case TWO -> //esse case dentro de um switch expression nao pode ser vazio. por isso temos um erro de compilação.
                    default -> "def";
                };
        System.out.println(val);
    }

    //obs. se fosse um switch statement (old switch) podemos ter um case vazio, veja o exemplo abaixo
    /*
    String val =
        switch(x) {
        case TWO : //tudo bem estar vazio essa condição do switch case statement usando dois pontos
        default: yield "def"; //temos que usar o yield na sintax com o antigo switch statement
    }
    */
}

