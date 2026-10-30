package org.exercises.interfaces;

public interface TestInterface {

    final int BUU_BUU = 10; //para variaveis da interface, elas sao sempre static e final, e tem que ter o valor declarado. sao constantes na pratica e tem seu nome em uppercase

    public static void main() { }//por mais estranho que seja, é permitido dentro da interface ter um metodo static com qualquer modificador de acesso, como o metodo main

    public default void draw(){}; //metodo default é permitido, e nao precisa obrigatoriamente ser implementado pela classe concreta pois é default

    sealed class TestClass {
        non-sealed class Free extends TestClass{} //podemos dentro da interface incluir uma sealed class testClass que sera extendida por uma non-sealed class free
    }

    //questão sobre interfaces. podemos ter uma variavel, chamada de campo, e ela é semelhante a uma constante e tem seu nome em letra maiúscula
    //a interface pode contter também metodo static.
    // a interface pode conter tambem metodo default, que por sua vez, nao obriga a ser implemetado por uma classe concreta
    //alem disso a interface pode conter classes, e conforme o exemplo, uma selead class que é extendida por outra classe non-sealed class
}
