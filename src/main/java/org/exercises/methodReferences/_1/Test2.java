package org.exercises.methodReferences._1;

public class Test2 {

    @FunctionalInterface //é um interface funcional pois so tem 01 metodo abstrato
    interface StringStart {
        boolean beginningCheck(String prefix); //criamos uma interface com metodo que tem um parametro
    }

    static void main() {
        var str = "Zoo"; //criamos uma variavel com valor "Zoo"
        StringStart methodRef = str::startsWith; //usamos method references para ter mais clareza ao implementar interfaces funcionais
        StringStart lambda = s -> s.startsWith(s);//podemos usar lambda tambem para implementar a interface funcional

        System.out.println(methodRef.beginningCheck("Z"));
    }
}
