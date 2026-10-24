package org.exercises.methodReferences;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class Test5 {

    static void main() {
        Supplier<StringBuilder> sb = StringBuilder::new; //cria um StringBuilder vazio atraves da interface funcional SUPPLIER
        Supplier<StringBuilder> sb1 = () -> new StringBuilder("Casa"); //atraves da interface funcional SUPLIER, cria um StringBuilder

        System.out.println(sb.get()); //a interface funcional SUPPLIER tem o metodo get()
        System.out.println(sb1.get());

        Supplier<LocalDate> ld = LocalDate::now; //
        Supplier<LocalDate> ld1 = () -> LocalDate.now(); //cria um LocalDate usando now atraves da interface funcional SUPPLIER

        System.out.println(ld.get()); //a interface funcional SUPPLIER tem o metodo get()
        System.out.println(ld1.get());

        Supplier<ArrayList<String>> arr = ArrayList::new; //cria um ArrayList usando method references atraves de uma interface funcional SUPPLIER
        Supplier<ArrayList<String>> arr1 = ()-> new ArrayList<>(); //cria um ArrayList usando lambda atraves de uma interface funcional SUPPLIER
        ArrayList<String> al = arr.get();

    }

    //usando interfaces funcional (SUPPLIER) é usada para criar objetos novos.
    //no exemplo temos criacao de objetos LocalDate, StringBuilder, ArrayList
}
