package org.exercises.strings;

public class StringWrapper {
    private String theVal;
    public StringWrapper(String str) {this.theVal = str;}

    static void main() {
        StringWrapper sw = new StringWrapper("How are you?");
        StringBuilder sb = new StringBuilder("How are you?");
        System.out.println("Hello, " + sw);
        System.out.println("Hello, " + sb);

        //String tem a implementação do metodo toString() que imprime o nome da classe e o hashcode
        //StringBuilder tem sua própria implementação que retorna o valor do conteudo
    }
}
