package org.exercises.overrridingPolimorfism._5;

public class TestClass2 {
    public static void main(String args[]) {
        Abasic o1 = new C(); //cria um objeto do tipo C e atribui esse objeto para uma superclasse A, pois indiretamente C extend B que extend A
        B o2 = (B) o1; //casting do objeto o1 para o tipo B
        System.out.println(o1.m1()); //como o1.m1() aponta para o objeto do tipo C, o metodo overriding int m1() da classe C é chamado, temos impresso 30
        System.out.println(o2.i); //como o2.i aponta para um objeto do tipo B, ao acessar sua variavel de classe, teremos impresso o i = 20
    }
}
class Abasic { int i = 10; int m1() {return i;} }

class B extends Abasic {int i = 20; int m1() {return i;} }

class C extends B {int i = 30; int m1() {return i;} }
