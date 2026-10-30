package org.exercises.interfaces._4;

public abstract class Test {
    abstract void draw (); //metodo abstrato, sem conchetes. metodo deve ser implementado pela classe concreta



    class Circle extends Test { //classe concreta que extends a superclasse Test e vai implementar o metodo draw
        @Override
        public void draw() { //metodo sobrescrito e com chaves
        }
    }

    //sobre interfaces. nesse caso temos um classe abstrata chamada Test que tem um metodo abstrato chamado draw().
    //a outra classe Circle extends a superclasse Test e sobrescreve o metodo abstrato draw e implementa esse metodo
    //tudo certo com o codigo é uma forma de sobrescrever o metodo feita corretamente
}
