package org.exercises.ooa._2;


public class Test1 {
    //var s; //não se usa var dentro de classes, mas sim dentro de métodos que estão na classe
    //String s = 'asdf'; //não se colocar um char dentro de uma String sem usarmos o casting explícito
    //String s = 'a'; //não se colocar um char dentro de uma String sem usarmos o casting explícito
    String s = this.toString(); //correto, cada classe tem como superclasse Object. Essa superclasse tem seus métodos um deles é toString
    //String s = asdf; //não compila pois para ser uma String tem que estar entre aspas duplas ""
    //var al;
    //al = new ArrayList<>(); //não se usa var dentro de classes
    //var al = new ArrayList<>(); //não compila, não se usa var dentro de classes, mas sim dentro de métodos que estão na classe

}
