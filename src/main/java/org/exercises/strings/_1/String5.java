package org.exercises.strings._1;

public class String5 {

    static void main() {
        String s1 = "Hello World";
        String s2 = """
            Hello World""";
        String s3 = """
            Hello World
            """;

        System.out.println((s1==s2) + " " + s2.equals(s3) + " " + s2.intern().equals(s3.intern()));

        //s1 e s2 tem uma unica string criada na memoria na compilacao
        //s2 e s3 sao diferentes em termos de conteudo, sendo que s3 tem uma nova linha no final enquanto s2 nao

    }


}
