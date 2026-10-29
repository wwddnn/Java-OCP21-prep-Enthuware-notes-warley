package org.exercises.overridingPolimorphism._1;

public class TestClass1 {

    //classe AA extends classe A

    static void main() {
        A a = new A(); //cria um objeto do tipo A
        AA aa = new AA(); //cria um objeto do tipo AA
        a = aa; //referencia do tipo a aponta para um objeto do tipo aa, isso é possível pois AA extends A
        System.out.println("a: " + a.getClass()); //imprime um objeto do tipo AA pois A esta apontando para AA
        System.out.println("aa: " + aa.getClass()); //imprime um objeto do tipo AA
    }
}
