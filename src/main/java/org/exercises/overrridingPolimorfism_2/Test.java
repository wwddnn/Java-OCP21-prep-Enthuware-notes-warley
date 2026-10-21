package org.exercises.overrridingPolimorfism_2;

public class Test {
    static void main() {
        A a = null;
        AA aa = null;

        a = (AA) aa; //correto pois um objeto da superclasse A pode apontar para um objeto da subclasse AA
        a = new AA(); //correto pois um objeto da superclasse A pode receber um novo objeto da subclasse AA
        //aa = new A(); //errado, um objeto da subclasse AA nao pode receber um novo objeto da superclasse A
        aa = (AA) a; //correto pois um objeto da subclasse AA pode aponar para um objeto com casting AA mesmo que seja da superclasse A
        //aa = a; //errado, pois um objeto da subclasse AA não pode apontar para um objeto da superclasse A. nesse caso é necessario o casting
        ((AA)a).doStuff(); //correto pois uma vez que fez o casting com AA entao podemos acessar os metodos dessa classe que nesse caso é o metodo doStuff()




    }
}
