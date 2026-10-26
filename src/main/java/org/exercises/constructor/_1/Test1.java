package org.exercises.constructor._1;

public class Test1 {
    class A{  }
    class B {  B(){ } }
    class C{  C(String s){ } }
}

//qual classe tem um construtor default?
//resposta: classe A.
//se uma classe tem um construtor definido como no exemplo a class C, entao nao é provido um construtor default pelo compilador automaticamente

//existe somente uma regra nesse caso, se a classe nao define um construtor entao o compilador prove um construtor default de forma automatica

//na classe B criamos um construtor sem argumentos que é semelhante ao construtor default, dessa forma entao como ja criamos, o compilador nao ira prover um construtor default automatico

//na classe C criamos um construtor com um argumento, dessa forma seguindo a regra como ja criamos um construtor, entao o compilador nao ira prover um construtor default autometico.
